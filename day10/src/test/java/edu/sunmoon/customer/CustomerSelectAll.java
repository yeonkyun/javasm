package edu.sunmoon.customer;

import edu.sunmoon.dto.Customer;
import edu.sunmoon.service.CustomerService;

import java.util.List;

public class CustomerSelectAll {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        try {
            List<Customer> result = service.get();
            result.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}