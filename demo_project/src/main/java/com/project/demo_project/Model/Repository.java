package com.project.demo_project.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends JpaRepository<User, Long> {

}
