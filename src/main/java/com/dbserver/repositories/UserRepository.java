package com.dbserver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbserver.entities.User;

public interface UserRepository extends JpaRepository <User, Long>{

}
