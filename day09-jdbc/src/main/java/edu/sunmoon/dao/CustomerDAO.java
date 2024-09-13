package edu.sunmoon.dao;

import edu.sunmoon.dto.Customer;
import edu.sunmoon.frame.Dao;
import edu.sunmoon.frame.Sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class CustomerDAO implements Dao<String, Customer> {

    @Override
    public Customer insert(Customer customer, Connection connection) throws Exception {
        PreparedStatement preparedStatement = connection.prepareStatement(Sql.insertCustomer);
        preparedStatement.setString(1, customer.getId());
        preparedStatement.setString(2, customer.getPw());
        preparedStatement.setString(3, customer.getName());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        return customer;
    }

    @Override
    public Customer update(Customer customer, Connection connection) throws Exception {
        return null;
    }

    @Override
    public Boolean delete(String s, Connection connection) throws Exception {
        return null;
    }

    @Override
    public Customer select(String s, Connection connection) throws Exception {
        return null;
    }

    @Override
    public List<Customer> select(Connection connection) throws Exception {
        return List.of();
    }
}