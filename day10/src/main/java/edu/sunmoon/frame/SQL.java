package edu.sunmoon.frame;

public class SQL {
    // CUSTOMER
    public static final String INSERT_CUSTOMER = "INSERT INTO CUSTOMER (ID, PASSWORD, NAME, AGE, GENDER, EMAIL, PHONE) VALUES (?, ?, ?, ?, ?, ?, ?)";
    public static final String SELECT_CUSTOMER = "SELECT * FROM CUSTOMER";
    public static final String SELECT_CUSTOMER_BY_ID = "SELECT * FROM CUSTOMER WHERE ID = ?";
    public static final String SELECT_CUSTOMER_BY_NAME = "SELECT * FROM CUSTOMER WHERE NAME = ?";
    public static final String UPDATE_CUSTOMER = "UPDATE CUSTOMER SET PASSWORD = ?, NAME = ?, AGE = ?, GENDER = ?, EMAIL = ?, PHONE = ? WHERE ID = ?";
    public static final String DELETE_CUSTOMER = "DELETE FROM CUSTOMER WHERE ID = ?";

    // PRODUCT
    public static final String INSERT_PRODUCT = "INSERT INTO PRODUCT (NANE, PRICE, CREATEDBY) VALUES (?, ?, ?)";
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
    public static final String DELETE_CART = "DELETE FROM CART WHERE CUSTOMER_ID = ? AND PRODUCT_ID = ?";
}
