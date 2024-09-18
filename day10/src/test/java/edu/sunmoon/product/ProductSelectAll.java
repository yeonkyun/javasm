package edu.sunmoon.product;

import edu.sunmoon.dto.Product;
import edu.sunmoon.service.ProductService;

import java.util.List;

public class ProductSelectAll {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        try {
            List<Product> result = service.get();
            result.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}