package com.example.springboot1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "companies")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Company {
    @Id
    @GeneratedValue(generator ="company-generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "company-generator",sequenceName = "company_seq",allocationSize = 1)
    private Long id;
    private String companyName;
    private String email;
    private String address;
    private LocalDateTime created;
    private String phoneNumber;
    private boolean blocked = true;
}

