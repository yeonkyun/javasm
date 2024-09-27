package edu.sunmoon.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    private String id;
    private String orderId;
    private String paymentMethod;   // ENUM ('신용카드', '계좌이체', '휴대폰결제', '카카오페이', '네이버페이')
    private int price;
    private String status;  // ENUM ('결제진행중'. '결제완료', '결제취소')
    private String createdAt;
}