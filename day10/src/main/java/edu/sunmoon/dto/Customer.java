package edu.sunmoon.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Customer {
    private String id;
    private String password;
    private String name;
    private int age;
    private String gender;
    private String email;
    private String phone;
    private LocalDateTime createdAt;
}
