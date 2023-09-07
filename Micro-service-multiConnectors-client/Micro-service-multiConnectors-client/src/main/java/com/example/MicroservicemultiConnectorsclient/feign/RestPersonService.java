package com.example.MicroservicemultiConnectorsclient.feign;

import com.example.MicroservicemultiConnectorsclient.entities.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:8080",value = "person-rest-client")
public interface RestPersonService {
    @GetMapping("/allPerson")
     List<Person> getAllPerson();

    @GetMapping("/person/{id}")
    Person getPersonById(@PathVariable(name = "id") Long id);
}
