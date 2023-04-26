package com.project.demo_project.Model;

import com.project.demo_project.Model.Role;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email;
    private String firstName;
    private String middleName;
    private String lastName;
    private String password;
    private String isActive;
    private String isDelete;
    private String isExpired;
    private String isLocked;
    private int invalidAttemptCount;
    private LocalDate passwordUpdateDate;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "userRole",
            joinColumns = @JoinColumn(name = "userId",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "roleId",referencedColumnName = "id"))
    private List<Role> role;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Address> address;

    public Role getRole() {
        return (Role) role;
    }

    public void setRole(Role role) {
         this.role = (List<Role>) role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return firstName;
    }

    public void setFirst_name(String first_name) {
        this.firstName = first_name;
    }

    public String getMiddle_name() {
        return middleName;
    }

    public void setMiddle_name(String middle_name) {
        this.middleName = middle_name;
    }

    public String getLast_name() {
        return lastName;
    }

    public void setLast_name(String last_name) {
        this.lastName = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIs_active() {
        return isActive;
    }

    public void setIs_active(String is_active) {
        this.isActive = is_active;
    }

    public String getIs_delete() {
        return isDelete;
    }

    public void setIs_delete(String is_delete) {
        this.isDelete = is_delete;
    }

    public String getIs_expired() {
        return isExpired;
    }

    public void setIs_expired(String is_expired) {
        this.isExpired = is_expired;
    }

    public String getIs_locked() {
        return isLocked;
    }

    public void setIs_locked(String is_locked) {
        this.isLocked = is_locked;
    }

    public int getInvalid_attempt_count() {
        return invalidAttemptCount;
    }

    public void setInvalid_attempt_count(int invalid_attempt_count) {
        this.invalidAttemptCount = invalid_attempt_count;
    }

    public LocalDate getPassword_update_date() {
        return passwordUpdateDate;
    }

    public void setPassword_update_date(LocalDate password_update_date) {
        this.passwordUpdateDate = password_update_date;
    }
}


