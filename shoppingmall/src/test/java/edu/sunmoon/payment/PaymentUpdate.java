package edu.sunmoon.payment;

import edu.sunmoon.dto.Payment;
import edu.sunmoon.service.PaymentService;

public class PaymentUpdate {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        try {
            System.out.println(paymentService.modify(Payment.builder()
                    .id(62)
                    .orderId(62)
                    .paymentMethod("카카오페이")
                    .price(100000)
                    .status("결제완료")
                    .build()));
            System.out.println(paymentService.get(63));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
