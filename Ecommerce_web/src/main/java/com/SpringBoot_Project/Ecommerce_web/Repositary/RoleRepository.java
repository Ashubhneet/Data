package com.SpringBoot_Project.Ecommerce_web.Repositary;

import com.SpringBoot_Project.Ecommerce_web.Model.User.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByAuthority(String authority);
}
