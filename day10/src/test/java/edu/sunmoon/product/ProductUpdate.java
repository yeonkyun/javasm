package edu.sunmoon.product;

import edu.sunmoon.dto.Product;
import edu.sunmoon.service.ProductService;

public class ProductUpdate {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        Product product = Product.builder()
                .name("메인보드")
                .price(170000)
                .createdBy("홍길동")
                .build();
        try {
            Product result = service.modify(product);
            System.out.println("Updated: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}