package edu.sunmoon.dao;

import edu.sunmoon.frame.DAO;
import edu.sunmoon.dto.Product;
import edu.sunmoon.frame.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO implements DAO<Integer, Product> {

    @Override
    public Product insert(Product product, Connection connection) throws Exception {
        try (PreparedStatement ps = connection.prepareStatement(SQL.INSERT_PRODUCT)) {
            ps.setString(1, product.getName());
            ps.setInt(2, product.getPrice());
            ps.setString(3, product.getCreatedBy());
            ps.executeUpdate();
        }
        return product;
    }

    @Override
    public Product update(Product product, Connection connection) throws Exception {
        try (PreparedStatement ps = connection.prepareStatement(SQL.UPDATE_PRODUCT)) {
            ps.setString(1, product.getName());
            ps.setInt(2, product.getPrice());
            ps.setString(3, product.getCreatedBy());
            ps.setInt(4, product.getId());
            ps.executeUpdate();
        }
        return product;
    }

    @Override
    public Boolean delete(Integer id, Connection connection) throws Exception {
        try (PreparedStatement ps = connection.prepareStatement(SQL.DELETE_PRODUCT)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        }
    }

    @Override
    public Product select(Integer id, Connection connection) throws Exception {
        Product product = null;
        try (PreparedStatement ps = connection.prepareStatement(SQL.SELECT_PRODUCT_BY_ID)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    product = new Product(
                        rs.getInt("ID"),
                        rs.getString("NAME"),
                        rs.getInt("PRICE"),
                        rs.getTimestamp("CREATEDAT").toLocalDateTime(),
                        rs.getTimestamp("LASTUPDATE").toLocalDateTime(),
                        rs.getString("CREATEDBY")
                    );
                }
            }
        }
        return product;
    }

    @Override
    public List<Product> select(Connection connection) throws Exception {
        List<Product> products = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(SQL.SELECT_PRODUCT);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                products.add(new Product(
                    rs.getInt("ID"),
                    rs.getString("NAME"),
                    rs.getInt("PRICE"),
                    rs.getTimestamp("CREATEDAT").toLocalDateTime(),
                    rs.getTimestamp("LASTUPDATE").toLocalDateTime(),
                    rs.getString("CREATEDBY")
                ));
            }
        }
        return products;
    }
}