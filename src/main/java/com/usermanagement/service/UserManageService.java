package com.usermanagement.service;

import java.util.List;

import com.usermanagement.entity.User;

public interface UserManageService {
	
	
	User createUser(User user);

    User getUserById(Long userId);

    User updateUser(User user);

    void deleteUser(Long userId);

}
