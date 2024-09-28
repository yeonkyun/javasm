package edu.sunmoon.frame;

public class SQL {
    // CUSTOMER
    public static final String INSERT_CUSTOMER = "INSERT INTO customer (customer_id, name, email, password, phone, level, created_at, updated_at)\n" +
            "VALUES (?, ?, ?, ?, ?, ?, NOW(), NOW())";
    public static final String SELECT_CUSTOMER = "SELECT * FROM customer";
    public static final String SELECT_CUSTOMER_BY_ID = "SELECT * FROM customer WHERE customer_id = ?";
    public static final String SELECT_CUSTOMER_BY_NAME = "SELECT * FROM customer WHERE name = ?";
    public static final String UPDATE_CUSTOMER = "UPDATE customer SET email = ?, password = ?, phone = ?, level = ?, updated_at = NOW() WHERE customer_id = ?";
    public static final String DELETE_CUSTOMER = "UPDATE customer SET status = 1, updated_at = NOW() WHERE customer_id = ?";

    // PRODUCT
    public static final String INSERT_PRODUCT = "INSERT INTO PRODUCT (NAME, PRICE, CREATEDBY) VALUES (?, ?, ?)";
    public static final String SELECT_PRODUCT = "SELECT * FROM PRODUCT";
    public static final String SELECT_PRODUCT_BY_ID = "SELECT * FROM PRODUCT WHERE ID = ?";
    public static final String SELECT_PRODUCT_BY_NAME = "SELECT * FROM PRODUCT WHERE NAME = ?";
    public static final String UPDATE_PRODUCT = "UPDATE PRODUCT SET NAME = ?, PRICE = ?, CREATEDBY = ? WHERE ID = ?";
    public static final String DELETE_PRODUCT = "DELETE FROM PRODUCT WHERE ID = ?";

    // CART
    public static final String INSERT_CART = "INSERT INTO CART (CUSTOMER_ID, PRODUCT_ID, QUANTITY) VALUES (?, ?, ?)";
    public static final String SELECT_CART = "SELECT * FROM CART";
    public static final String SELECT_CART_BY_CUSTOMER_ID = "SELECT * FROM CART WHERE CUSTOMER_ID = ?";
    public static final String SELECT_CART_BY_PRODUCT_ID = "SELECT * FROM CART WHERE PRODUCT_ID = ?";
    public static final String UPDATE_CART = "UPDATE CART SET QUANTITY = ? WHERE CUSTOMER_ID = ? AND PRODUCT_ID = ?";
    public static final String DELETE_CART = "DELETE FROM CART WHERE CUSTOMER_ID = ? AND ID = ?";
}
