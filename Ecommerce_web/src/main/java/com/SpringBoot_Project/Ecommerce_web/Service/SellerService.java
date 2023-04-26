package com.SpringBoot_Project.Ecommerce_web.Service;

import com.SpringBoot_Project.Ecommerce_web.Dto.SellerRegisterDto;

public interface SellerService {

    void createSeller(SellerRegisterDto sellerRegisterDto);

    boolean checkForEmail(String email,SellerRegisterDto sellerRegisterDto);

    boolean checkForGst(SellerRegisterDto sellerRegisterDto);

    boolean checkForCompanyName(SellerRegisterDto sellerRegisterDto);
}
