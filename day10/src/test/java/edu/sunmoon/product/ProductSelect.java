package edu.sunmoon.product;

import edu.sunmoon.dto.Product;
import edu.sunmoon.service.ProductService;

public class ProductSelect {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        try {
            Product result = service.get(1);
            System.out.println("Selected: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}