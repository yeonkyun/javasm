package edu.sunmoon.ws0911.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DBConnection {
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection != null) {
            return connection;
        }

        try (InputStream inputStream = DBConnection.class.getResourceAsStream("application.properties")) {
            Properties properties = new Properties();

            // 파일을 읽을 수 없을 경우 IOException 발생
            if (inputStream == null) {
                throw new IOException("application.properties 파일을 찾을 수 없습니다.");
            }

            properties.load(inputStream);

            String url = properties.getProperty("db.url");
            String user = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, user, password);

        } catch (IOException | SQLException | ClassNotFoundException ex) {
            throw new RuntimeException("데이터베이스 연결에 실패했습니다.", ex);
        }

        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                throw new RuntimeException("데이터베이스 연결을 닫는 중 오류가 발생했습니다.", ex);
            }
        }
    }

}
