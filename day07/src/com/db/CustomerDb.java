package com.db;

public class CustomerDb implements Db {
    @Override
    public void create(Object obj) {
        System.out.println("Inserted: " + obj);
    }

    @Override
    public void read(Object obj) {
        System.out.println("Read: " + obj);
    }

    @Override
    public void update(Object obj) {
        System.out.println("Updated: " + obj);
    }

    @Override
    public void delete(Object obj) {
        System.out.println("Deleted: " + obj);
    }
}
