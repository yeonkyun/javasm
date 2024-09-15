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

public class Product {
    int id;
    String name;
    int price;
    LocalDateTime createdAt;
    LocalDateTime lastUpdatedAt;
    String createdBy;
}
