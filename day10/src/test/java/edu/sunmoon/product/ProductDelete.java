package edu.sunmoon.product;

import edu.sunmoon.service.ProductService;

public class ProductDelete {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        try {
            Boolean result = service.remove(0);
            System.out.println("Deleted: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}