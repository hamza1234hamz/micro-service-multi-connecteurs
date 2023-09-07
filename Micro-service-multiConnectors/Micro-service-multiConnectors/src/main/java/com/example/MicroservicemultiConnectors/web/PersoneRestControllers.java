package com.example.MicroservicemultiConnectors.web;

import com.example.MicroservicemultiConnectors.Repository.PersoneRepository;
import com.example.MicroservicemultiConnectors.entities.Persone;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
public class PersoneRestControllers {
    private PersoneRepository personeRepository;

    @GetMapping("/allPerson")
    public List<Persone> AllPersons(){
        return personeRepository.findAll();
    }

    @GetMapping("/person/{id}")
    public Persone Person (@PathVariable String id){
        return personeRepository.findById(id)
                .orElseThrow(()-> new RuntimeException(String.format("person %s not found",id)));
    }

    @PostMapping("/save")
    public Persone Save(@RequestBody Persone person){
        return personeRepository.save(person);
    }

    @PutMapping("/update/{id}")
    public Persone update(@PathVariable String id,@RequestBody Persone persone){
        Persone persone1=personeRepository.findById(id).orElseThrow();
        if (persone.getNom()!=null) persone1.setNom(persone.getNom());
        if (persone.getEmail()!=null) persone1.setEmail(persone.getEmail());
        if (persone.getContactNumber()!=null) persone1.setContactNumber(persone.getContactNumber());
        return personeRepository.save(persone1);
    }

    @DeleteMapping("/delete/{id}")
    public void delete (@PathVariable String id){
        personeRepository.deleteById(id);
    }
}
