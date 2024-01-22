package com.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.usermanagement.entity.User;
public interface UserManageRepository  extends JpaRepository<User, Long>{

}
