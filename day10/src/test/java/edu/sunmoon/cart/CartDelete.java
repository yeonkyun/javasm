package edu.sunmoon.cart;

import edu.sunmoon.service.CartService;

public class CartDelete {
    public static void main(String[] args) {
        CartService service = new CartService();
        try {
            Boolean result = service.remove("id01", 2);
            System.out.println("Deleted: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}