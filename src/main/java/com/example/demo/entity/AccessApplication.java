package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Document
@Data
public class AccessApplication {

    @Id
    private String id;

    @NotBlank
    private String name;

    @NotBlank
    private String city;

    @Min(18)
    @Max(60)
    private int age;

    @NotBlank
    private String intent;

    @Email
    @NotBlank
    private String email;

    // getters & setters
}
