package edu.sunmoon;

import java.sql.*;

public class Select {
    public static void main(String[] args) {
        // 1. MySQL JDBC 드라이버 로딩
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC 드라이버를 찾을 수 없습니다.");
            System.out.println(e.getMessage());
        }

        // 2. MySQL 서버 연결
        String url = "jdbc:mysql://yeonkyun.kro.kr:3306/javaSMU";
        String sql_user = "smuser";
        String sql_password = "000000";

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, sql_user, sql_password);
            System.out.println("MySQL 서버 연결에 성공했습니다.");
        } catch (SQLException e) {
            System.out.println("MySQL 서버 연결에 실패했습니다.");
            System.out.println(e.getMessage());
        }
        // 3. SQL 문장 실행
        String selectOneSql = "SELECT * FROM customer WHERE id = ?";

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(selectOneSql);
            preparedStatement.setString(1, "id01");
            resultSet = preparedStatement.executeQuery();
            System.out.println("id\t\tpw\t\tname");
            resultSet.next();
            String id = resultSet.getString("id");
            String pw = resultSet.getString("pw");
            String name = resultSet.getString("name");
            System.out.println(id + "\t" + pw + "\t" + name);
            System.out.println("데이터 추출에 성공했습니다.");
        } catch (SQLException e) {
            System.out.println("데이터 추출에 실패했습니다.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                    resultSet.close();
                    System.out.println("PreparedStatement를 닫았습니다.");
                } catch (SQLException e) {
                    System.out.println("PreparedStatement를 닫는데 실패했습니다.");
                    System.out.println(e.getMessage());
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("MySQL 서버 연결을 종료했습니다.");
                } catch (SQLException e) {
                    System.out.println("MySQL 서버 연결을 종료하는데 실패했습니다.");
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
