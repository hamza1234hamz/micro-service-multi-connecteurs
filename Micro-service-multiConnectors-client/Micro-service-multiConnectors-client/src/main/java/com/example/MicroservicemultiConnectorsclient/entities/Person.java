package com.example.MicroservicemultiConnectorsclient.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Builder
public class Person {
    private Long id;
    private String name;
    private String email;
}
