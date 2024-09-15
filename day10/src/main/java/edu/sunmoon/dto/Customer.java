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
    String id;
    String password;
    String name;
    int age;
    String gender;
    String email;
    String phone;
    LocalDateTime createdAt;
}
