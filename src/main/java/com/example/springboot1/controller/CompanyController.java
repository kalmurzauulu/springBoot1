package com.example.springboot1.controller;

import com.example.springboot1.dto.CompanyRequest;
import com.example.springboot1.dto.CompanyResponse;
import com.example.springboot1.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/company")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService service;

    @PostMapping
    public CompanyResponse create(@RequestBody CompanyRequest companyRequest) {
        return service.create(companyRequest);
    }

    @PutMapping("{id}")
    public CompanyResponse update(@PathVariable long id, @RequestBody CompanyRequest request) {
        return service.update(id, request);
    }

    @GetMapping("{id}")
    public CompanyResponse getById(@PathVariable long id) {
        return service.findById(id);
    }

    @DeleteMapping("{id}")
    public CompanyResponse delete(@PathVariable long id) {
        return service.delete(id);
    }

}
