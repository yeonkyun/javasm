package edu.sunmoon.service;

import edu.sunmoon.dao.CartDAO;
import edu.sunmoon.dto.Cart;
import edu.sunmoon.frame.ConnectionPool;
import edu.sunmoon.frame.Mservice;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CartService implements Mservice<String, Cart> {
    CartDAO dao;
    ConnectionPool pool;

    public CartService() {
        dao = new CartDAO();
        try {
            pool = ConnectionPool.create();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Cart add(Cart cart) throws Exception {
        Connection connection = pool.getConnection();
        try {
            connection.setAutoCommit(false);
            dao.insert(cart, connection);
            System.out.println("CartService.add() - " + cart);
            connection.commit();
        } catch (Exception e) {
            connection.rollback();
            throw e;
        } finally {
            pool.releaseConnection(connection);
        }
        return cart;
    }

    @Override
    public Cart modify(Cart cart) throws Exception {
        Connection connection = pool.getConnection();
        try {
            connection.setAutoCommit(false);
            dao.update(cart, connection);
            System.out.println("CartService.modify() - " + cart);
            connection.commit();
        } catch (Exception e) {
            connection.rollback();
            throw e;
        } finally {
            pool.releaseConnection(connection);
        }
        return cart;
    }

    @Override
    public Boolean remove(String customerId, int cartId) throws Exception {
        Connection connection = pool.getConnection();
        Boolean result = false;
        try {
            connection.setAutoCommit(false);
            result = dao.delete(customerId, cartId, connection);
            System.out.println("CartService.remove() - " + customerId + ", " + cartId);
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
    public Cart get(String customerId) throws Exception {
        Connection connection = pool.getConnection();
        Cart cart = null;
        try {
            cart = dao.select(customerId, connection);
            System.out.println("CartService.get() - " + customerId);
        } catch (Exception e) {
            throw e;
        } finally {
            pool.releaseConnection(connection);
        }
        return cart;
    }

    @Override
    public List<Cart> get() throws Exception {
        Connection connection = pool.getConnection();
        List<Cart> list = null;
        try {
            list = dao.select(connection);
            System.out.println("CartService.get()");
        } catch (Exception e) {
            throw e;
        } finally {
            pool.releaseConnection(connection);
        }
        return list;
    }
}