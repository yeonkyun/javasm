package edu.sunmoon.dao;

import edu.sunmoon.frame.DAO;
import edu.sunmoon.dto.Cart;
import edu.sunmoon.frame.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CartDAO implements DAO<String, Cart> {

    @Override
    public Cart insert(Cart cart, Connection connection) throws Exception {
        try (PreparedStatement ps = connection.prepareStatement(SQL.INSERT_CART)) {
            ps.setString(1, cart.getCustomerId());
            ps.setInt(2, cart.getProductId());
            ps.setInt(3, cart.getQuantity());
            ps.executeUpdate();
        }
        return cart;
    }

    @Override
    public Cart update(Cart cart, Connection connection) throws Exception {
        try (PreparedStatement ps = connection.prepareStatement(SQL.UPDATE_CART)) {
            ps.setInt(1, cart.getQuantity());
            ps.setString(2, cart.getCustomerId());
            ps.setInt(3, cart.getProductId());
            ps.executeUpdate();
        }
        return cart;
    }

    @Override
    public Boolean delete(String customerId, Connection connection) throws Exception {
        try (PreparedStatement ps = connection.prepareStatement(SQL.DELETE_CART)) {
            ps.setString(1, customerId);
            return ps.executeUpdate() > 0;
        }
    }

    @Override
    public Cart select(String customerId, Connection connection) throws Exception {
        Cart cart = null;
        try (PreparedStatement ps = connection.prepareStatement(SQL.SELECT_CART_BY_CUSTOMER_ID)) {
            ps.setString(1, customerId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    cart = new Cart(
                        rs.getInt("ID"),
                        rs.getString("CUSTOMER_ID"),
                        rs.getInt("PRODUCT_ID"),
                        rs.getInt("QUANTITY"),
                        rs.getTimestamp("CREATEDAT").toLocalDateTime()
                    );
                }
            }
        }
        return cart;
    }

    @Override
    public List<Cart> select(Connection connection) throws Exception {
        List<Cart> carts = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(SQL.SELECT_CART);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                carts.add(new Cart(
                    rs.getInt("ID"),
                    rs.getString("CUSTOMER_ID"),
                    rs.getInt("PRODUCT_ID"),
                    rs.getInt("QUANTITY"),
                    rs.getTimestamp("CREATEDAT").toLocalDateTime()
                ));
            }
        }
        return carts;
    }
}