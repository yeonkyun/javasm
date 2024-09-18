package edu.sunmoon.cart;

import edu.sunmoon.dto.Cart;
import edu.sunmoon.service.CartService;

public class CartSelect {
    public static void main(String[] args) {
        CartService service = new CartService();
        try {
            Cart result = service.get("id01");
            System.out.println("Selected: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}