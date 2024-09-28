package edu.sunmoon.service;

import edu.sunmoon.dao.CustomerDAO;
import edu.sunmoon.dto.Customer;
import edu.sunmoon.frame.ConnectionPool;
import edu.sunmoon.frame.Mservice;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CustomerService implements Mservice<String, Customer> {
    CustomerDAO dao;
    ConnectionPool pool;

    public CustomerService() {
        dao = new CustomerDAO();
        pool = ConnectionPool.create();
    }

    @Override
    public Customer add(Customer customer) throws Exception {
        Connection connection = pool.getConnection();
        try {
            connection.setAutoCommit(false);
            dao.insert(customer, connection);
            System.out.println("CustomerService.add() - " + customer);
            connection.commit();
        } catch (Exception e) {
            connection.rollback();
            throw e;
        } finally {
            pool.releaseConnection(connection);
        }
        return customer;
    }

    @Override
    public Customer modify(Customer customer) throws Exception {
        Connection connection = pool.getConnection();
        try {
            dao.update(customer, connection);
        } catch (Exception e) {
            connection.rollback();
            throw e;
        } finally {
            pool.releaseConnection(connection);
        }
        return customer;
    }

    @Override
    public Boolean remove(String s) throws Exception {
        Connection connection = pool.getConnection();
        Boolean result = false;
        try {
            result = dao.delete(s, connection);
            System.out.println("CustomerService.remove() - " + s);
        } catch (Exception e) {
            connection.rollback();
            throw e;
        } finally {
            pool.releaseConnection(connection);
        }
        return result;
    }

    @Override
    public Customer get(String s) throws Exception {
        Connection connection = pool.getConnection();
        Customer result = null;
        try {
            result = dao.select(s, connection);
        } catch (Exception e) {
            throw e;
        } finally {
            pool.releaseConnection(connection);
        }
        return result;
    }

    @Override
    public List<Customer> get() throws Exception {
        Connection connection = pool.getConnection();
        List<Customer> result = null;
        try {
            result = dao.select(connection);
        } catch (Exception e) {
            throw e;
        } finally {
            pool.releaseConnection(connection);
        }
        return result;
    }
}
