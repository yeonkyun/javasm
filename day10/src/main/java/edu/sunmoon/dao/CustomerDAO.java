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
            ps.setString(1, customer.getId());
            ps.setString(2, customer.getPassword());
            ps.setString(3, customer.getName());
            ps.setInt(4, customer.getAge());
            ps.setString(5, customer.getGender());
            ps.setString(6, customer.getEmail());
            ps.setString(7, customer.getPhone());
            ps.executeUpdate();
        }
        return customer;
    }

    @Override
    public Customer update(Customer customer, Connection connection) throws Exception {
        try (PreparedStatement ps = connection.prepareStatement(SQL.UPDATE_CUSTOMER)) {
            ps.setString(1, customer.getPassword());
            ps.setString(2, customer.getName());
            ps.setInt(3, customer.getAge());
            ps.setString(4, customer.getGender());
            ps.setString(5, customer.getEmail());
            ps.setString(6, customer.getPhone());
            ps.setString(7, customer.getId());
            ps.executeUpdate();
        }
        return customer;
    }

    @Override
    public Boolean delete(String id, Connection connection) throws Exception {
        try (PreparedStatement ps = connection.prepareStatement(SQL.DELETE_CUSTOMER)) {
            ps.setString(1, id);
            return ps.executeUpdate() > 0;
        }
    }

    @Override
    public Customer select(String id, Connection connection) throws Exception {
        Customer customer = null;
        try (PreparedStatement ps = connection.prepareStatement(SQL.SELECT_CUSTOMER_BY_ID)) {
            ps.setString(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    customer = new Customer(
                        rs.getString("ID"),
                        rs.getString("PASSWORD"),
                        rs.getString("NAME"),
                        rs.getInt("AGE"),
                        rs.getString("GENDER"),
                        rs.getString("EMAIL"),
                        rs.getString("PHONE"),
                        rs.getTimestamp("CREATEDAT").toLocalDateTime()
                    );
                }
            }
        }
        return customer;
    }

    @Override
    public List<Customer> select(Connection connection) throws Exception {
        List<Customer> customers = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(SQL.SELECT_CUSTOMER);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                customers.add(new Customer(
                    rs.getString("ID"),
                    rs.getString("PASSWORD"),
                    rs.getString("NAME"),
                    rs.getInt("AGE"),
                    rs.getString("GENDER"),
                    rs.getString("EMAIL"),
                    rs.getString("PHONE"),
                    rs.getTimestamp("CREATEDAT").toLocalDateTime()
                ));
            }
        }
        return customers;
    }
}