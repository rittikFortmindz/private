package com.example.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AccessApplicationRequest {

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
