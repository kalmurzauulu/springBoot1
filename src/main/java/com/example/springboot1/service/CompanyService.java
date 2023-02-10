package com.example.springboot1.service;

import com.example.springboot1.dto.CompanyRequest;
import com.example.springboot1.dto.CompanyResponse;
import com.example.springboot1.entity.Company;
import com.example.springboot1.mapper.CompanyEditMapper;
import com.example.springboot1.mapper.CompanyViewMapper;
import com.example.springboot1.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {
    private final CompanyEditMapper editMapper;
    private final CompanyViewMapper viewMapper;
    private final CompanyRepository repository;

    public CompanyResponse create(CompanyRequest request) {
        Company company = editMapper.create(request);
        repository.save(company);
        return viewMapper.viewCompany(company);
    }

    public CompanyResponse update(long id,CompanyRequest request) {
        Company company = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Element not found!"));
        editMapper.update(company,request);
        repository.save(company);
        return viewMapper.viewCompany(company);
    }

    public CompanyResponse findById(long id) {
        Company company = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Element not found!"));
        return viewMapper.viewCompany(company);
    }

    public CompanyResponse delete(long id) {
        Company company = repository.getById(id);
        repository.deleteById(id);
        return viewMapper.viewCompany(company);
    }

    public List<CompanyResponse> getAllCompany() {
        return viewMapper.view(repository.findAll());
    }
}
