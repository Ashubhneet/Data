package com.SpringBoot_Project.Ecommerce_web.Dto;

import com.SpringBoot_Project.Ecommerce_web.Model.User.Address;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class SellerRegisterDto {
    private String email;
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@!$%*#?&])[A-Za-z\\d@!$%*#?&]{8,15}$",
            message = "Password must be at least 8 characters long,contain at least 1 letter," +
                    "1 digit,1 Special Character,1 Lower case,1 Upper case and 1 Special Character")
    private String password;
    private String conformPassword;
    private String firstName;
    private String middleName;
    private String lastname;
    @Pattern(regexp = "^[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[1-9A-Z]{1}Z[0-9A-Z]{1}$",
            message = "It should be 15 characters long\n" +
                    "The first 2 characters should be a number\n" +
                    "The next 10 characters should be the PAN number of the taxpayer\n" +
                    "The 13th character (entity code) should be a number from 1-9 or an alphabet\n" +
                    "The 14th character should be Z\n" +
                    "The 15th character should be an alphabet or a number\n")
    private String gst;
    @Size(min = 10, max = 10)
    private Long companyContact;
    private String companyName;
    private Address address;
}
