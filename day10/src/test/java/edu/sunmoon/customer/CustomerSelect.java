package edu.sunmoon.customer;

import edu.sunmoon.dto.Customer;
import edu.sunmoon.service.CustomerService;

public class CustomerSelect {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        try {
            Customer result = service.get("id01");
            System.out.println("Selected: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}