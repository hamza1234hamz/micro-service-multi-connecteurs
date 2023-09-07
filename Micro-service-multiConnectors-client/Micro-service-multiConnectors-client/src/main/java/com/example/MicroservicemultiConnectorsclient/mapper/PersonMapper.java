package com.example.MicroservicemultiConnectorsclient.mapper;

import com.example.MicroservicemultiConnectorsclient.entities.Person;
import com.example.MicroservicemultiConnectorsclient.stub.PersonServiceOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {
    private ModelMapper modelMapper=new ModelMapper();

    public Person fromGrpcCustomer(PersonServiceOuterClass.Person grpcperson){
        return modelMapper.map(grpcperson, Person.class);
    }
}
