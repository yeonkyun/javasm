package edu.sunmoon.ws0911.dao;

import edu.sunmoon.ws0911.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductDAO {
    public void selectAll() {
        // 데이터베이스에서 product 테이블의 모든 레코드를 조회하는 SQL을 실행하는 코드
        String query = "SELECT * FROM product";

        // try-with-resources 구문을 사용하여 자원을 자동으로 해제
        try (Connection connection = DBConnection.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                String imageName = resultSet.getString("image_name");
                String createBy = resultSet.getString("create_by");
                String createAt = resultSet.getString("create_at");
                System.out.println("{id=" + id + ", name=" + name + ", price=" + price + ", imageName=" + imageName + ", createBy=" + createBy + ", createAt=" + createAt + "}");
            }
        } catch (Exception ex) {
            throw new RuntimeException("데이터베이스 조회 중 오류가 발생했습니다.", ex);
        }
    }

    public void selectById(int id) {
        // 데이터베이스에서 product 테이블에서 id가 일치하는 레코드를 조회하는 SQL을 실행하는 코드
        String query = "SELECT * FROM product WHERE id = ?";

        try (Connection connection = DBConnection.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                String imageName = resultSet.getString("image_name");
                String createBy = resultSet.getString("create_by");
                String createAt = resultSet.getString("create_at");
                System.out.println("{id=" + id + ", name=" + name + ", price=" + price + ", imageName=" + imageName + ", createBy=" + createBy + ", createAt=" + createAt + "}");
            }
        } catch (Exception ex) {
            throw new RuntimeException("데이터베이스 조회 중 오류가 발생했습니다.", ex);
        }
    }

    public void selectByName(String name) {
        // 데이터베이스에서 product 테이블에서 name이 일치하는 레코드를 조회하는 SQL을 실행하는 코드
        String query = "SELECT * FROM product WHERE name = ?";

        try (Connection connection = DBConnection.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int price = resultSet.getInt("price");
                String imageName = resultSet.getString("image_name");
                String createBy = resultSet.getString("create_by");
                String createAt = resultSet.getString("create_at");
                System.out.println("{id=" + id + ", name=" + name + ", price=" + price + ", imageName=" + imageName + ", createBy=" + createBy + ", createAt=" + createAt + "}");
            }
        } catch (Exception ex) {
            throw new RuntimeException("데이터베이스 조회 중 오류가 발생했습니다.", ex);
        }
    }

    public void selectByPrice(int price) {
        // 데이터베이스에서 product 테이블에서 price가 일치하는 레코드를 조회하는 SQL을 실행하는 코드
        String query = "SELECT * FROM product WHERE price = ?";

        try (Connection connection = DBConnection.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, price);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String imageName = resultSet.getString("image_name");
                String createBy = resultSet.getString("create_by");
                String createAt = resultSet.getString("create_at");
                System.out.println("{id=" + id + ", name=" + name + ", price=" + price + ", imageName=" + imageName + ", createBy=" + createBy + ", createAt=" + createAt + "}");
            }
        } catch (Exception ex) {
            throw new RuntimeException("데이터베이스 조회 중 오류가 발생했습니다.", ex);
        }
    }

    public void selectByCreateBy(String createBy) {
        // 데이터베이스에서 product 테이블에서 createBy가 일치하는 레코드를 조회하는 SQL을 실행하는 코드
        String query = "SELECT * FROM product WHERE create_by = ?";

        try (Connection connection = DBConnection.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, createBy);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                String imageName = resultSet.getString("image_name");
                String createAt = resultSet.getString("create_at");
                System.out.println("{id=" + id + ", name=" + name + ", price=" + price + ", imageName=" + imageName + ", createBy=" + createBy + ", createAt=" + createAt + "}");
            }
        } catch (Exception ex) {
            throw new RuntimeException("데이터베이스 조회 중 오류가 발생했습니다.", ex);
        }
    }

    public void selectByCreateAt(String createAt) {
        // 데이터베이스에서 product 테이블에서 createAt이 일치하는 레코드를 조회하는 SQL을 실행하는 코드
        String query = "SELECT * FROM product WHERE create_at = ?";

        try (Connection connection = DBConnection.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, createAt);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                String imageName = resultSet.getString("image_name");
                String createBy = resultSet.getString("create_by");
                System.out.println("{id=" + id + ", name=" + name + ", price=" + price + ", imageName=" + imageName + ", createBy=" + createBy + ", createAt=" + createAt + "}");
            }
        } catch (Exception ex) {
            throw new RuntimeException("데이터베이스 조회 중 오류가 발생했습니다.", ex);
        }
    }

    public void insert() {
        // 데이터베이스에 product 테이블에 레코드를 추가하는 SQL을 실행하는 코드
        String query = "INSERT INTO product (name, price, image_name, create_by) VALUES (?, ?, ?, ?)";

        try (Connection connection = DBConnection.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "새로운 상품");
            preparedStatement.setInt(2, 10000);
            preparedStatement.setString(3, "새로운 상품 이미지");
            preparedStatement.setString(4, "admin");
            preparedStatement.executeUpdate();
            System.out.println("데이터베이스에 상품을 추가했습니다.");
        } catch (Exception ex) {
            throw new RuntimeException("데이터베이스 추가 중 오류가 발생했습니다.", ex);
        }
    }

    public void update() {
        // 데이터베이스에 product 테이블에 레코드를 수정하는 SQL을 실행하는 코드
        String query = "UPDATE product SET name = ?, price = ?, image_name = ?, create_by = ? WHERE id = ?";

        try (Connection connection = DBConnection.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "수정된 상품");
            preparedStatement.setInt(2, 20000);
            preparedStatement.setString(3, "수정된 상품 이미지");
            preparedStatement.setString(4, "admin");
            preparedStatement.setInt(5, 1);
            preparedStatement.executeUpdate();
            System.out.println("데이터베이스에 상품을 수정했습니다.");
        } catch (Exception ex) {
            throw new RuntimeException("데이터베이스 수정 중 오류가 발생했습니다.", ex);
        }
    }

    public void delete() {
        // 데이터베이스에 product 테이블에 레코드를 삭제하는 SQL을 실행하는 코드
        String query = "DELETE FROM product WHERE id = ?";

        try (Connection connection = DBConnection.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, 1);
            preparedStatement.executeUpdate();
            System.out.println("데이터베이스에 상품을 삭제했습니다.");
        } catch (Exception ex) {
            throw new RuntimeException("데이터베이스 삭제 중 오류가 발생했습니다.", ex);
        }
    }
}
