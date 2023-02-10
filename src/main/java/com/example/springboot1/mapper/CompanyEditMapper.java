package com.example.springboot1.mapper;

import com.example.springboot1.dto.CompanyRequest;
import com.example.springboot1.entity.Company;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class CompanyEditMapper {
    public Company create(CompanyRequest companyRequest) {
        if(companyRequest == null){
            return null;
        }
        Company company = new Company();
        company.setCompanyName(companyRequest.getCompanyName());
        company.setAddress(companyRequest.getAddress());
        company.setEmail(companyRequest.getEmail());
        company.setPhoneNumber(companyRequest.getPhoneNumber());
        company.setCreated(LocalDateTime.now());

        return company;
    }

    public Company update(Company company,CompanyRequest request){
        company.setCompanyName(request.getCompanyName());
        company.setAddress(request.getAddress());
        company.setEmail(request.getEmail());
        company.setPhoneNumber(request.getPhoneNumber());

        return company;
    }
}
