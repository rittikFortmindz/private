package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.AccessApplicationRequest;
import com.example.demo.dto.ApiResponse;
import com.example.demo.service.AccessApplicationService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/access")
@CrossOrigin(origins = "*") // tighten later
public class AccessApplicationController {

    private final AccessApplicationService service;

    public AccessApplicationController(AccessApplicationService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> apply(@Valid @RequestBody AccessApplicationRequest request) {
        service.submit(request);
        return ResponseEntity.ok().body(
                new ApiResponse(true, "Application submitted successfully"));
    }
}
