package com.project.demo_project.Model;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "userId")
public class Seller extends User{
    private String gst;
    private Long companyContact;
    private String companyName;

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public Long getCompany_contact() {
        return companyContact;
    }

    public void setCompany_contact(Long company_contact) {
        this.companyContact = company_contact;
    }

    public String getCompany_name() {
        return companyName;
    }

    public void setCompany_name(String company_name) {
        this.companyName = company_name;
    }
}
