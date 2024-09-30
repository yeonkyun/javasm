package edu.sunmoon.frame;

public class SQL {
    // address
    public static final String INSERT_ADDRESS = "INSERT INTO address (customer_id, type, name, phone, address1, address2, zip_code, is_default) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String SELECT_ADDRESS = "SELECT * FROM address";
    public static final String SELECT_ADDRESS_BY_ID = "SELECT * FROM address WHERE address_id = ?";
    public static final String SELECT_ADDRESS_BY_CUSTOMER_ID = "SELECT * FROM address WHERE customer_id = ?";
    public static final String UPDATE_ADDRESS = "UPDATE address SET type = ?, name = ?, phone = ?, address1 = ?, address2 = ?, zip_code = ?, is_default = ? WHERE address_id = ?";
    public static final String DELETE_ADDRESS = "DELETE FROM address WHERE address_id = ?";

    // cart
    public static final String INSERT_CART = "INSERT INTO cart (customer_id, product_id, quantity, total_price, created_at) SELECT ?, ?, ?, (product.price * ?), NOW() FROM product WHERE product.product_id = ?";
    public static final String SELECT_CART = "SELECT *, product.name FROM cart JOIN product ON cart.product_id = product.product_id";
    public static final String SELECT_CART_BY_CUSTOMER_ID = "SELECT *, product.name FROM cart JOIN product ON cart.product_id = product.product_id WHERE customer_id = ?";
    public static final String SELECT_CART_BY_PRODUCT_ID = "SELECT *, product.name FROM cart JOIN product ON cart.product_id = product.product_id WHERE cart.product_id = ?";
    public static final String UPDATE_CART = "UPDATE cart JOIN product ON cart.product_id = product.product_id SET cart.quantity = ?, cart.total_price = (product.price * ?) WHERE cart.cart_id = ?";
    public static final String DELETE_CART = "DELETE FROM cart WHERE cart_id = ?";

    // category
    public static final String INSERT_CATEGORY = "INSERT INTO category (category_id, parents_id, name) VALUES (?, ?, ?)";
    public static final String SELECT_CATEGORY = "SELECT * FROM category";
    public static final String SELECT_CATEGORY_BY_ID = "SELECT * FROM category WHERE category_id = ?";
    public static final String SELECT_CATEGORY_BY_PARENTS_ID = "SELECT * FROM category WHERE parents_id = ?";
    public static final String SELECT_CATEGORY_BY_NAME = "SELECT * FROM category WHERE name = ?";
    public static final String UPDATE_CATEGORY = "UPDATE category SET parents_id = ?, name = ? WHERE category_id = ?";
    public static final String DELETE_CATEGORY = "DELETE FROM category WHERE category_id = ?";


    // customer
    public static final String INSERT_CUSTOMER = "INSERT INTO customer (customer_id, name, email, password, phone, level, created_at, updated_at) VALUES (?, ?, ?, ?, ?, ?, NOW(), NOW())";
    public static final String SELECT_CUSTOMER = "SELECT * FROM customer";
    public static final String SELECT_CUSTOMER_BY_ID = "SELECT * FROM customer WHERE customer_id = ?";
    public static final String SELECT_CUSTOMER_BY_NAME = "SELECT * FROM customer WHERE name = ?";
    public static final String UPDATE_CUSTOMER = "UPDATE customer SET email = ?, password = ?, phone = ?, level = ?, updated_at = NOW() WHERE customer_id = ?";
    public static final String DELETE_CUSTOMER = "UPDATE customer SET status = 0, updated_at = NOW() WHERE customer_id = ?";

    // product
    public static final String INSERT_PRODUCT = "INSERT INTO PRODUCT (NAME, PRICE, CREATEDBY) VALUES (?, ?, ?)";
    public static final String SELECT_PRODUCT = "SELECT * FROM PRODUCT";
    public static final String SELECT_PRODUCT_BY_ID = "SELECT * FROM PRODUCT WHERE ID = ?";
    public static final String SELECT_PRODUCT_BY_NAME = "SELECT * FROM PRODUCT WHERE NAME = ?";
    public static final String UPDATE_PRODUCT = "UPDATE PRODUCT SET NAME = ?, PRICE = ?, CREATEDBY = ? WHERE ID = ?";
    public static final String DELETE_PRODUCT = "DELETE FROM PRODUCT WHERE ID = ?";

}
