package edu.sunmoon.couponBox;

import edu.sunmoon.service.CouponBoxService;
import edu.sunmoon.service.CouponService;

public class CouponBoxSelectById {
    public static void main(String[] args) {
        CouponBoxService service = new CouponBoxService();
        try {
            System.out.println(service.get(52));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
