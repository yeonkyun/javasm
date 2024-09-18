package edu.sunmoon.product;

import edu.sunmoon.dto.Product;
import edu.sunmoon.service.ProductService;

public class ProductInsert {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        Product product = Product.builder()
                .name("메인보드")
                .price(15000)
                .createdBy("홍길동")
                .build();
        try {
            Product result = service.add(product);
            System.out.println("Inserted: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}