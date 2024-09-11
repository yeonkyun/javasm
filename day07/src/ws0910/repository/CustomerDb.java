package ws0910.repository;

import ws0910.dto.Customer;
import ws0910.frame.Db;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        customers.add(new Customer("id01", "pw01", "정연균"));
        customers.add(new Customer("id02", "pw02", "조현열"));
        customers.add(new Customer("id03", "pw03", "홍길동"));
        customers.add(new Customer("id04", "pw04", "김철수"));
        customers.add(new Customer("id05", "pw05", "이영희"));
        customers.add(new Customer("id06", "pw06", "박영수"));
        customers.add(new Customer("id07", "pw07", "최영희"));
        customers.add(new Customer("id08", "pw08", "김영수"));
        customers.add(new Customer("id09", "pw09", "이철수"));
        customers.add(new Customer("id10", "pw10", "박영희"));

        return customers;
    }

    @Override
    public List<Customer> searchByName(String name) throws Exception {
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("id01", "pw01", "정연균"));
        customers.add(new Customer("id02", "pw02", "조현열"));
        customers.add(new Customer("id03", "pw03", "홍길동"));
        customers.add(new Customer("id04", "pw04", "김철수"));
        customers.add(new Customer("id05", "pw05", "이영희"));
        customers.add(new Customer("id06", "pw06", "박영수"));
        customers.add(new Customer("id07", "pw07", "최영희"));
        customers.add(new Customer("id08", "pw08", "김영수"));
        customers.add(new Customer("id09", "pw09", "이철수"));
        customers.add(new Customer("id10", "pw10", "박영희"));

        return customers.stream()
                .filter(customer -> customer.getName().contains(name))
                .collect(Collectors.toList());
    }

    @Override
    public List<Customer> searchById(String id) throws Exception {
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("id01", "pw01", "정연균"));
        customers.add(new Customer("id02", "pw02", "조현열"));
        customers.add(new Customer("id03", "pw03", "홍길동"));
        customers.add(new Customer("id04", "pw04", "김철수"));
        customers.add(new Customer("id05", "pw05", "이영희"));
        customers.add(new Customer("id06", "pw06", "박영수"));
        customers.add(new Customer("id07", "pw07", "최영희"));
        customers.add(new Customer("id08", "pw08", "김영수"));
        customers.add(new Customer("id09", "pw09", "이철수"));
        customers.add(new Customer("id10", "pw10", "박영희"));

        return customers.stream()
                .filter(customer -> customer.getId().equals(id))
                .collect(Collectors.toList());
    }
}