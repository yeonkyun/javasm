package com.db;

public class Customer {
    private String id;
    private String pw;
    private String name;

    public Customer() {
    }

    public Customer(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPw() {
        return pw;
    }

    @Override
    public String toString() {
        return "Customer {" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
