package edu.sunmoon.frame;

public class Sql {
    public static final String insertCustomer = "INSERT INTO customer(ID, PW, NAME) VALUES(?,?,?)";
    public static final String selectCustomer = "SELECT * FROM customer WHERE ID=?";
    public static final String selectAllCustomer = "SELECT * FROM customer";
    public static final String updateCustomer = "UPDATE customer SET PW=?, NAME=? WHERE ID=?";
    public static final String deleteCustomer = "DELETE FROM customer WHERE ID=?";
}
