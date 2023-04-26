package com.hibernate2.hibernate_2;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "checks")
@PrimaryKeyJoinColumn(name = "id")
public class Check extends Payment{
    public String check_no;

    public String getCheck_no() {
        return check_no;
    }

    public void setCheck_no(String check_no) {
        this.check_no = check_no;
    }
}
