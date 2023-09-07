package com.example.MicroservicemultiConnectorsclient.web;

import com.example.MicroservicemultiConnectorsclient.entities.Person;
import com.example.MicroservicemultiConnectorsclient.feign.RestPersonService;
import com.example.MicroservicemultiConnectorsclient.mapper.PersonMapper;
import com.example.MicroservicemultiConnectorsclient.stub.PersonServiceGrpc;
import com.example.MicroservicemultiConnectorsclient.stub.PersonServiceOuterClass;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.reactive.function.client.WebClientCustomizer;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("Client")
public class PersonRestController {
    @Autowired
    private PersonMapper personMapper;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private RestPersonService personService;
    @GrpcClient(value = "personService")
    private PersonServiceGrpc.PersonServiceBlockingStub personServiceBlockingStub;
    @GetMapping("/person")  // cette methode permet de connecter via rest on utilisant restTemplete qui un model bloqaunt
    public List<Person> personList(){
        Person[] persons = restTemplate.getForObject("http://localhost:8080/allPerson", Person[].class);
        return List.of(persons);
    }

    @GetMapping("/person/v2")
    public List<Person> personListV2(){
        return personService.getAllPerson();
    }
    @GetMapping("/person/{id}")
    public Person personById(@PathVariable String id){
        Person person = restTemplate.getForObject("http://localhost:8080/person/" + id, Person.class);
        return person;
    }

    @GetMapping("/person/v2/{id}")
    public Person personByIdV2(@PathVariable Long id){
        return personService.getPersonById(id);
    }

    @GetMapping("/grpc/persons")
    public List<Person> grpcPersons(){
        PersonServiceOuterClass.GetAllPersonsRequest request = PersonServiceOuterClass.GetAllPersonsRequest.newBuilder().build();
        PersonServiceOuterClass.GetAllPersonsResponse response
                = personServiceBlockingStub.getAllPersons(request);
        List<PersonServiceOuterClass.Person> personsList = response.getPersonsList();
        List<Person> personList = personsList.stream().map(personMapper::fromGrpcCustomer).collect(Collectors.toList());
        return personList;
    }



}



















