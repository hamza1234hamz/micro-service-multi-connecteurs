package com.example.MicroservicemultiConnectors.web;

import com.example.MicroservicemultiConnectors.Repository.PersoneRepository;
import com.example.MicroservicemultiConnectors.entities.Persone;
import com.example.MicroservicemultiConnectors.mapper.PersonMapper;
import com.example.MicroservicemultiConnectors.stub.PersonServiceGrpc;
import com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@GrpcService
public class PersonGrpService extends PersonServiceGrpc.PersonServiceImplBase {
    @Autowired
    private PersoneRepository personeRepository;
    @Autowired
    private PersonMapper personMapper;

    @Override
    public void getAllPersons(PersonServiceOuterClass.GetAllPersonsRequest request, StreamObserver<PersonServiceOuterClass.GetAllPersonsResponse> responseObserver) {
        List<Persone> personeList = personeRepository.findAll();
        List<PersonServiceOuterClass.Person> grpcListPerson =
                personeList.stream()
                        .map(personMapper::fromPerson).collect(Collectors.toList());
        PersonServiceOuterClass.GetAllPersonsResponse personsResponse=
                PersonServiceOuterClass.GetAllPersonsResponse.newBuilder()
                        .addAllPersons(grpcListPerson)
                        .build();
        responseObserver.onNext(personsResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getPersonById(PersonServiceOuterClass.GePersonByIdRequest request, StreamObserver<PersonServiceOuterClass.GePersonByIdResponse> responseObserver) {
        Persone personeEntities=personeRepository.findById(String.valueOf(request.getPersonId())).get();
        PersonServiceOuterClass.GePersonByIdResponse response=
            PersonServiceOuterClass.GePersonByIdResponse.newBuilder()
                    .setPerson(personMapper.fromPerson(personeEntities))
                    .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void savePersonX(PersonServiceOuterClass.SavePersonRequest request, StreamObserver<PersonServiceOuterClass.SavePersonResponse> responseObserver) {
        PersonServiceOuterClass.PersonRequest personRequest=request.getPerson();
        Persone persone=personMapper.fromGrpcPersonRequest(personRequest);
        Persone savedPerson = personeRepository.save(persone);
        PersonServiceOuterClass.SavePersonResponse response=
                PersonServiceOuterClass.SavePersonResponse.newBuilder()
                        .setPerson(personMapper.fromPerson(savedPerson))
                        .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
