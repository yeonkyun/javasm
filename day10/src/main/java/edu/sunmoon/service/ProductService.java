package edu.sunmoon.service;

import edu.sunmoon.dao.CustomerDAO;
import edu.sunmoon.dao.ProductDAO;
import edu.sunmoon.dto.Product;
import edu.sunmoon.frame.ConnectionPool;
import edu.sunmoon.frame.Mservice;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ProductService implements Mservice<Integer, Product> {
    ProductDAO dao;
    ConnectionPool pool;

    public ProductService() {
        dao = new ProductDAO();
        try {
            pool = ConnectionPool.create();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Product add(Product product) throws Exception {
        Connection connection = pool.getConnection();
        try {
            connection.setAutoCommit(false);
            dao.insert(product, connection);
            System.out.println("ProductService.add() - " + product);
            connection.commit();
        } catch (Exception e) {
            connection.rollback();
            throw e;
        } finally {
            pool.releaseConnection(connection);
        }
        return product;
    }

    @Override
    public Product modify(Product product) throws Exception {
        Connection connection = pool.getConnection();
        try {
            connection.setAutoCommit(false);
            dao.update(product, connection);
            System.out.println("ProductService.modify() - " + product);
            connection.commit();
        } catch (Exception e) {
            connection.rollback();
            throw e;
        } finally {
            pool.releaseConnection(connection);
        }
        return product;
    }

    @Override
    public Boolean remove(Integer id) throws Exception {
        Connection connection = pool.getConnection();
        Boolean result = false;
        try {
            connection.setAutoCommit(false);
            result = dao.delete(id, connection);
            System.out.println("ProductService.remove() - " + id);
            connection.commit();
        } catch (Exception e) {
            connection.rollback();
            throw e;
        } finally {
            pool.releaseConnection(connection);
        }
        return result;
    }

    @Override
    public Product get(Integer id) throws Exception {
        Connection connection = pool.getConnection();
        Product product = null;
        try {
            product = dao.select(id, connection);
            System.out.println("ProductService.get() - " + id);
        } catch (Exception e) {
            throw e;
        } finally {
            pool.releaseConnection(connection);
        }
        return product;
    }

    @Override
    public List<Product> get() throws Exception {
        Connection connection = pool.getConnection();
        List<Product> list = null;
        try {
            list = dao.select(connection);
            System.out.println("ProductService.get()");
        } catch (Exception e) {
            throw e;
        } finally {
            pool.releaseConnection(connection);
        }
        return list;
    }
}
