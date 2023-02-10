package com.example.springboot1.mapper;

import com.example.springboot1.dto.CompanyResponse;
import com.example.springboot1.entity.Company;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompanyViewMapper {
    public CompanyResponse viewCompany(Company company) {
        if (company == null) {
            return null;
        }

        CompanyResponse response = new CompanyResponse();
        response.setId(company.getId());
        response.setCompanyName(company.getCompanyName());
        response.setAddress(company.getAddress());
        response.setEmail(company.getEmail());
        response.setPhoneNumber(company.getPhoneNumber());
        response.setBlocked(company.isBlocked());
        response.setCreated(company.getCreated());

        return response;
    }

    public List<CompanyResponse> view(List<Company> company) {
        List<CompanyResponse> responses = new ArrayList<>();
        for (Company c : company) {
            responses.add(viewCompany(c));
        }return responses;
    }
}
