package edu.sunmoon.cart;

import edu.sunmoon.dto.Cart;
import edu.sunmoon.service.CartService;

import java.util.List;

public class CartSelectAll {
    public static void main(String[] args) {
        CartService service = new CartService();
        try {
            List<Cart> result = service.get();
            result.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}