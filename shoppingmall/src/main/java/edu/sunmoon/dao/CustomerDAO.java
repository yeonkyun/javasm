package edu.sunmoon.dao;

import edu.sunmoon.frame.DAO;
import edu.sunmoon.dto.Customer;
import edu.sunmoon.frame.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO implements DAO<String, Customer> {

    @Override
    public Customer insert(Customer customer, Connection connection) throws Exception {
        try (PreparedStatement ps = connection.prepareStatement(SQL.INSERT_CUSTOMER)) {
        }
        return customer;
    }

    @Override
    public Customer update(Customer customer, Connection connection) throws Exception {
        try (PreparedStatement ps = connection.prepareStatement(SQL.UPDATE_CUSTOMER)) {
        }
        return customer;
    }

    @Override
    public Boolean delete(String id, Connection connection) throws Exception {
        try (PreparedStatement ps = connection.prepareStatement(SQL.DELETE_CUSTOMER)) {
            return ps.executeUpdate() > 0;
        }
    }

    @Override
    public Customer select(String id, Connection connection) throws Exception {
        Customer customer = null;
        try (PreparedStatement ps = connection.prepareStatement(SQL.SELECT_CUSTOMER_BY_ID)) {

        }
        return customer;
    }

    @Override
    public List<Customer> select(Connection connection) throws Exception {
        List<Customer> customers = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(SQL.SELECT_CUSTOMER); {

        }
        return customers;
    }
}