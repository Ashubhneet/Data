package com.SpringBoot_Project.Ecommerce_web.Controllers;

import com.SpringBoot_Project.Ecommerce_web.Dto.CustomerRegisterDto;
import com.SpringBoot_Project.Ecommerce_web.Dto.SellerRegisterDto;
import com.SpringBoot_Project.Ecommerce_web.Security.JwtTokenGenerator;
import com.SpringBoot_Project.Ecommerce_web.Service.Imp.CustomerServiceImp;
import com.SpringBoot_Project.Ecommerce_web.Service.Imp.SellerServiceImp;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthRegisterController {


    private CustomerServiceImp customerService;
    @Autowired
    private SellerServiceImp sellerService;
    @Autowired
    private JwtTokenGenerator jwtTokenGenerator;

    @PostMapping("/customer/register")
    public ResponseEntity<String> customerRegister(@Valid @RequestBody CustomerRegisterDto customerRegisterDto) {
        if (customerService.checkForMail(customerRegisterDto)) {
            return new ResponseEntity<>("email is taken already", HttpStatus.BAD_REQUEST);
        }
        if (!customerRegisterDto.getPassword().equals(customerRegisterDto.getConformPassword())) {
            return ResponseEntity.badRequest().body("password did not match");
        }
        customerService.createCustomer(customerRegisterDto);
        return new ResponseEntity<>("User register success", HttpStatus.OK);
    }

    @PostMapping("/seller/register")
    public ResponseEntity<String> sellerRegister(@RequestBody SellerRegisterDto sellerRegisterDto) {
        if (sellerService.checkForEmail(sellerRegisterDto.getEmail(),sellerRegisterDto)) {
            return new ResponseEntity<>("Email is taken already", HttpStatus.BAD_REQUEST);
        }
        if (!sellerRegisterDto.getPassword().equals(sellerRegisterDto.getConformPassword())) {
            return ResponseEntity.badRequest().body("Password did not match");
        }
        if (sellerService.checkForGst(sellerRegisterDto)) {
            return new ResponseEntity<>("GST number is already associated with other company", HttpStatus.BAD_REQUEST);
        }
        if (sellerService.checkForCompanyName(sellerRegisterDto)) {
            return new ResponseEntity<>("Name is registered with other company", HttpStatus.BAD_REQUEST);
        }
        sellerService.createSeller(sellerRegisterDto);
        return new ResponseEntity<>("Seller registered successfully", HttpStatus.OK);
    }

    @PostMapping("/activation/customer")
    public ResponseEntity<?> activationCustomer(@RequestParam("token")String token){
        if(customerService.checkForValidToken(token)){
            return ResponseEntity.ok("Account activated");
        }
        return new ResponseEntity<>("token didn't match or expired",HttpStatus.BAD_REQUEST);
    }
}
