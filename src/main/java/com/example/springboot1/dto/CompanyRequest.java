package com.example.springboot1.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class CompanyRequest {
    private String companyName;
    private String email;
    private String address;
    private String phoneNumber;

}
