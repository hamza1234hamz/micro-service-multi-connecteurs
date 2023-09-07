package com.example.MicroservicemultiConnectors.web;

import com.example.MicroservicemultiConnectors.Repository.PersoneRepository;
import com.example.MicroservicemultiConnectors.entities.Persone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@AllArgsConstructor
public class PersonGraphqlController {
    private PersoneRepository personeRepository;

    @QueryMapping
    public List<Persone> personList(){
        return personeRepository.findAll();
    }
    @QueryMapping
    public Persone PersonById(@Argument String id){
        return personeRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("perdon %s NOT FOUND",id)));
    }


    @MutationMapping
    public Persone savePerson(@Argument PersonDto personTosave){
        Persone persone1= Persone.builder()
                .nom(personTosave.getNom())
                .email(personTosave.getEmail())
                .ContactNumber(personTosave.getContactNumber())
                .build();
        Persone savedPerson =personeRepository.save(persone1);
        return  savedPerson;
    }

    @MutationMapping
    public Persone updatePerson(@Argument String id,@Argument PersonDto personToUpdate){
        Persone persone=personeRepository.findById(id).orElseThrow(()-> new RuntimeException(String.format("Person %s not found",id)));
        persone.setNom(personToUpdate.getNom());
        persone.setEmail(personToUpdate.getEmail());
        persone.setContactNumber(personToUpdate.getContactNumber());
        Persone UpdatedPerson =personeRepository.save(persone);
        return  UpdatedPerson;
    }

    @MutationMapping
    public Boolean DeletePerson(@Argument String id){
        personeRepository.deleteById(id);
        return true;
    }
}
@Data
@AllArgsConstructor @NoArgsConstructor
class PersonDto {
    String nom;
    String email;
    String ContactNumber;
}
