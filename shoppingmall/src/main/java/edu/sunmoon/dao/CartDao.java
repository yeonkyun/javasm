package edu.sunmoon.dao;

import edu.sunmoon.dto.Cart;
import edu.sunmoon.frame.DAO;
import edu.sunmoon.frame.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class CartDao implements DAO<Integer, Cart> {
    @Override
    public Cart insert(Cart cart, Connection connection) throws Exception {
        try (PreparedStatement ps = connection.prepareStatement(SQL.INSERT_CART)) {
            ps.setInt(1, cart.getCustomerId());
            ps.setInt(2, cart.getProductId());
            ps.setInt(3, cart.getQuantity());
            ps.setInt(4, cart.getQuantity());
            ps.setInt(5, cart.getProductId());
            ps.executeUpdate();
        }
        return cart;
    }

    @Override
    public Cart update(Cart cart, Connection connection) throws Exception {
        try (PreparedStatement ps = connection.prepareStatement(SQL.UPDATE_CART)) {
            ps.setInt(1, cart.getQuantity());
            ps.executeUpdate();
        }
        return cart;
    }

    @Override
    public Boolean delete(Integer integer, Connection connection) throws Exception {
        return null;
    }

    @Override
    public Cart select(Integer integer, Connection connection) throws Exception {
        return null;
    }

    @Override
    public List<Cart> select(Connection connection) throws Exception {
        return List.of();
    }
}
