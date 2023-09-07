package com.example.MicroservicemultiConnectors.mapper;

import com.example.MicroservicemultiConnectors.entities.Persone;
import com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {
    private ModelMapper modelMapper=new ModelMapper();
    public PersonServiceOuterClass.Person fromPerson(Persone persone){
        return modelMapper.map(persone, PersonServiceOuterClass.Person.Builder.class).build();
    }

    public Persone fromGrpcPersonRequest(PersonServiceOuterClass.PersonRequest personRequest){
        return modelMapper.map(personRequest, Persone.class);
    }
}











