package edu.sunmoon;

import com.mysql.cj.jdbc.exceptions.CommunicationsException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
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
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } catch (CommunicationsException e) {
            System.out.println("Communications Exception");
            System.out.println(e.getMessage());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            try {
                connection = DriverManager.getConnection(url, sql_user, sql_password);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } catch (SQLException e) {
            System.out.println("MySQL 서버 연결에 실패했습니다.");
            System.out.println(e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("MySQL 서버 연결을 닫았습니다.");
                } catch (SQLException e) {
                    System.out.println("MySQL 서버 연결을 닫는데 실패했습니다.");
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
