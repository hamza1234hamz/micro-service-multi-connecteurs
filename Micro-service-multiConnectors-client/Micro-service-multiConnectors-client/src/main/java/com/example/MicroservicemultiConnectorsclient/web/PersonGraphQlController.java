package com.example.MicroservicemultiConnectorsclient.web;

import com.example.MicroservicemultiConnectorsclient.entities.Person;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
@RestController
@RequestMapping("Client")
public class PersonGraphQlController {

    @GetMapping("/GraphQl/person/{id}")
    public Mono<Person> personById(@PathVariable Long id){
        HttpGraphQlClient graphQlClient= HttpGraphQlClient.builder()
                .url("http://localhost:8080/graphql")
                .build();
        var httpRequestDocument= """
                query ($id:Int){
                 PersonById(id:$id)
                  {id,nom}
                }
                """;
        Mono <Person> personById=graphQlClient.document(httpRequestDocument)
                .variable("id",id).retrieve("PersonById").toEntity(Person.class);
        return personById;
    }
}
