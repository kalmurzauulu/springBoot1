package com.example.springboot1.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class CompanyResponse {
    private Long id;
    private String companyName;
    private String email;
    private String address;
    private String phoneNumber;
    private LocalDateTime created;
    private boolean blocked;
}
