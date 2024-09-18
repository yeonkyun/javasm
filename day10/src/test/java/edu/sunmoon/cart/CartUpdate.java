package edu.sunmoon.cart;

import edu.sunmoon.dto.Cart;
import edu.sunmoon.service.CartService;

public class CartUpdate {
    public static void main(String[] args) {
        CartService service = new CartService();
        Cart cart = Cart.builder()
                .id(1)
                .customerId("customerId")
                .productId(1)
                .quantity(3)
                .build();
        try {
            Cart result = service.modify(cart);
            System.out.println("Updated: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}