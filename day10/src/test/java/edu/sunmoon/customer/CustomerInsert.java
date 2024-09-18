package edu.sunmoon.customer;

import edu.sunmoon.dto.Customer;
import edu.sunmoon.service.CustomerService;

public class CustomerInsert {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        Customer customer = Customer.builder()
                .id("id01")
                .password("pw01")
                .name("홍길동")
                .age(20)
                .gender("M")
                .email("email@sunmoon.ac.kr")
                .phone("010-1234-5678")
                .build();
        try {
            Customer result = service.add(customer);
            System.out.println("Inserted: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}