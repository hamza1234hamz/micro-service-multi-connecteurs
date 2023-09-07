package com.example.MicroservicemultiConnectors;

import com.example.MicroservicemultiConnectors.Repository.PersoneRepository;
import com.example.MicroservicemultiConnectors.entities.Persone;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class MicroServiceMultiConnectorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceMultiConnectorsApplication.class, args);
	}

	@Bean
	CommandLineRunner start(PersoneRepository personeRepository){
		return args -> {
			Stream.of("hamza","amin","youssef").forEach(c->{
				Persone persone =Persone.builder()
						.nom(c)
						.email("persone@gmail.com")
						.ContactNumber("120021")
						.build();
				personeRepository.save(persone);
			});
		};
	}

}
