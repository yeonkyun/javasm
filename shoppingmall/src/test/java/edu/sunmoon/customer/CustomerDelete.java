package edu.sunmoon.customer;

import edu.sunmoon.service.CustomerService;

public class CustomerDelete {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        try {
            boolean result = service.remove("customer999");
            System.out.println("Deleted: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
