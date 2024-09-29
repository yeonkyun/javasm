package edu.sunmoon.frame;

public class SQL {
    // ADDRESS
    public static final String INSERT_ADDRESS = "INSERT INTO address (customer_id, type, name, phone, address1, address2, zip_code, is_default) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String SELECT_ADDRESS = "SELECT * FROM address";
    public static final String SELECT_ADDRESS_BY_ID = "SELECT * FROM address WHERE address_id = ?";
    public static final String SELECT_ADDRESS_BY_CUSTOMER_ID = "SELECT * FROM address WHERE customer_id = ?";
    public static final String UPDATE_ADDRESS = "UPDATE address SET type = ?, name = ?, phone = ?, address1 = ?, address2 = ?, zip_code = ?, is_default = ? WHERE address_id = ?";
    public static final String DELETE_ADDRESS = "DELETE FROM address WHERE address_id = ?";

    // CART
    public static final String INSERT_CART = "INSERT INTO cart (customer_id, product_id, quantity, total_price, created_at) SELECT ?, ?, ?, (product.price * ?), NOW() FROM product WHERE product.id = ?";
    public static final String SELECT_CART = "SELECT * FROM CART";
    public static final String SELECT_CART_BY_CUSTOMER_ID = "SELECT * FROM CART WHERE CUSTOMER_ID = ?";
    public static final String SELECT_CART_BY_PRODUCT_ID = "SELECT * FROM CART WHERE PRODUCT_ID = ?";
    public static final String UPDATE_CART = "UPDATE CART SET QUANTITY = ? WHERE CUSTOMER_ID = ? AND PRODUCT_ID = ?";
    public static final String DELETE_CART = "DELETE FROM CART WHERE CUSTOMER_ID = ? AND ID = ?";

    // CUSTOMER
    public static final String INSERT_CUSTOMER = "INSERT INTO customer (customer_id, name, email, password, phone, level, created_at, updated_at) VALUES (?, ?, ?, ?, ?, ?, NOW(), NOW())";
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

}
