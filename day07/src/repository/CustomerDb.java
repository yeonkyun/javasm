package repository;

import dto.Customer;
import frame.Db;

import java.util.ArrayList;
import java.util.List;

public class CustomerDb implements Db<String, Customer> {

    @Override
    public void insert(Customer customer) throws Exception {
        System.out.println("Inserted: " + customer.getName());
    }

    @Override
    public void update(Customer customer) throws Exception {
        System.out.println("Updated: " + customer.getName());
    }

    @Override
    public void delete(String s) throws Exception {
        System.out.println("Deleted: " + s);
    }

    @Override
    public Customer select(String s) throws Exception {
        Customer customer = new Customer(s, "password", "name");
        return customer;
    }

    @Override
    public List<Customer> select() throws Exception {
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("id01", "password01", "name01"));
        customers.add(new Customer("id02", "password02", "name02"));
        customers.add(new Customer("id03", "password03", "name03"));
        customers.add(new Customer("id04", "password04", "name04"));
        customers.add(new Customer("id05", "password05", "name05"));
        return customers;
    }

    @Override
    public List<Customer> searchByName(String name) throws Exception {
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("id01", "password01", "name01"));
        customers.add(new Customer("id02", "password02", "name02"));
        customers.add(new Customer("id03", "password03", "name03"));
        customers.add(new Customer("id04", "password04", "name04"));
        customers.add(new Customer("id05", "password05", "name05"));
        return customers;
    }
}
