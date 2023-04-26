package com.security.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CouponRestController {

    @Autowired
    CouponRepo couponRepo;
    @GetMapping("/coupons")
    public Coupon create(@RequestBody Coupon coupon){
        return couponRepo.save(coupon);
    }
    @GetMapping("/coupons/{code}")
    public Coupon getCoupon(@PathVariable("code") String code){
       return couponRepo.findByCode(code);
    }
}
