package edu.sunmoon.ws0911.dao;

import edu.sunmoon.ws0911.util.DBConnection;
import edu.sunmoon.ws0911.entity.product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    public List<product> selectAll() {
        List<product> products = new ArrayList<>();
        String query = "SELECT * FROM product";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                products.add(extractProductFromResultSet(resultSet));
            }
        } catch (SQLException ex) {
            throw new RuntimeException("데이터베이스 조회 중 오류가 발생했습니다.", ex);
        }
        return products;
    }

    public product selectById(int id) {
        String query = "SELECT * FROM product WHERE id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return extractProductFromResultSet(resultSet);
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException("데이터베이스 조회 중 오류가 발생했습니다.", ex);
        }
        return null;
    }

    public List<product> selectByName(String name) {
        List<product> products = new ArrayList<>();
        String query = "SELECT * FROM product WHERE name = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, name);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    products.add(extractProductFromResultSet(resultSet));
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException("데이터베이스 조회 중 오류가 발생했습니다.", ex);
        }
        return products;
    }

    public List<product> selectByPrice(int price) {
        List<product> products = new ArrayList<>();
        String query = "SELECT * FROM product WHERE price = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, price);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    products.add(extractProductFromResultSet(resultSet));
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException("데이터베이스 조회 중 오류가 발생했습니다.", ex);
        }
        return products;
    }

    public List<product> selectByCreateBy(String createBy) {
        List<product> products = new ArrayList<>();
        String query = "SELECT * FROM product WHERE create_by = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, createBy);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    products.add(extractProductFromResultSet(resultSet));
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException("데이터베이스 조회 중 오류가 발생했습니다.", ex);
        }
        return products;
    }

    public List<product> selectByCreateAt(String createAt) {
        List<product> products = new ArrayList<>();
        String query = "SELECT * FROM product WHERE create_at = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, createAt);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    products.add(extractProductFromResultSet(resultSet));
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException("데이터베이스 조회 중 오류가 발생했습니다.", ex);
        }
        return products;
    }

    public int insert(product product) {
        String query = "INSERT INTO product (name, price, image_name, create_by) VALUES (?, ?, ?, ?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setString(1, product.getName());
            preparedStatement.setInt(2, product.getPrice());
            preparedStatement.setString(3, product.getImageName());
            preparedStatement.setString(4, product.getCreateBy());

            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("상품 생성 실패, 영향받은 행이 없습니다.");
            }

            try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1);
                } else {
                    throw new SQLException("상품 생성 실패, ID를 가져올 수 없습니다.");
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException("데이터베이스 추가 중 오류가 발생했습니다.", ex);
        }
    }

    public boolean update(product product) {
        String query = "UPDATE product SET name = ?, price = ?, image_name = ?, create_by = ? WHERE id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, product.getName());
            preparedStatement.setInt(2, product.getPrice());
            preparedStatement.setString(3, product.getImageName());
            preparedStatement.setString(4, product.getCreateBy());
            preparedStatement.setInt(5, product.getId());

            int affectedRows = preparedStatement.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException ex) {
            throw new RuntimeException("데이터베이스 수정 중 오류가 발생했습니다.", ex);
        }
    }

    public boolean delete(int id) {
        String query = "DELETE FROM product WHERE id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, id);

            int affectedRows = preparedStatement.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException ex) {
            throw new RuntimeException("데이터베이스 삭제 중 오류가 발생했습니다.", ex);
        }
    }

    private product extractProductFromResultSet(ResultSet resultSet) throws SQLException {
        return new product(
                resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getInt("price"),
                resultSet.getString("image_name"),
                resultSet.getTimestamp("create_at").toLocalDateTime(),
                resultSet.getTimestamp("update_at") != null ? resultSet.getTimestamp("update_at").toLocalDateTime() : null,
                resultSet.getString("create_by")
        );
    }
}