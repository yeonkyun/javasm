package edu.sunmoon.frame;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ConnectionPool {

    private List<Connection> connectionPool;
    private List<Connection> usedConnections = new ArrayList<>();
    private static int INITIAL_POOL_SIZE = 3;
    private static Properties properties = new Properties();

    static {
        try (InputStream input = ConnectionPool.class.getClassLoader().getResourceAsStream("mysql.properties")) {
            if (input == null) {
                throw new RuntimeException("Sorry, unable to find mysql.properties");
            }
            properties.load(input);
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("OK");
            System.out.println(properties.getProperty("mysql.url"));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ConnectionPool create() throws SQLException {
        String url = properties.getProperty("mysql.url");
        String user = properties.getProperty("mysql.username");
        String password = properties.getProperty("mysql.password");

        List<Connection> pool = new ArrayList<>(INITIAL_POOL_SIZE);
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            pool.add(createConnection(url, user, password));
        }
        return new ConnectionPool(pool);
    }

    public ConnectionPool(List<Connection> connectionPool) {
        this.connectionPool = connectionPool;
    }

    public Connection getConnection() {
        Connection connection = connectionPool.remove(connectionPool.size() - 1);
        usedConnections.add(connection);
        return connection;
    }

    public boolean releaseConnection(Connection connection) {
        connectionPool.add(connection);
        return usedConnections.remove(connection);
    }

    private static Connection createConnection(String url, String user, String password) throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public int getSize() {
        return connectionPool.size() + usedConnections.size();
    }

    public int getUseSize() {
        return connectionPool.size();
    }
}