package com.security.Security;

import com.security.Security.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CouponRepo extends JpaRepository<Coupon, Long> {
   Coupon findByCode(String code);
}
