package com.example.MicroservicemultiConnectors.Repository;

import com.example.MicroservicemultiConnectors.entities.Persone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface PersoneRepository extends JpaRepository<Persone,String> {
}
