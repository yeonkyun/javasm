package com.application;

import com.db.*;

public class Main {
    public static void main(String[] args) {
        Db customerDb = new CustomerDb();
        Customer customer = new Customer("id01", "pw01", "James");
        customerDb.create(customer);
        customerDb.read(customer);
        customerDb.update(customer);
        customerDb.delete(customer.getId());

        Db itemDb = new ItemDb();
        Item item = new Item(1, "Laptop", 1000);
        itemDb.create(item);
        itemDb.read(item);
        itemDb.update(item);
        itemDb.delete(item.getId());
    }
}
