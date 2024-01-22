package com.usermanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.usermanagement.entity.User;
import com.usermanagement.repository.UserManageRepository;

import lombok.AllArgsConstructor;
@Service
@Component
@AllArgsConstructor
public class UserManageServiceImpl implements UserManageService {
	@Autowired
	  private UserManageRepository UserManageRepository;
	
	
	@Override
	public User createUser(User user) {
		
		 return UserManageRepository.save(user);
		 
	}

	@Override
	public User getUserById(Long userId) {
		  Optional<User> optionalUser = UserManageRepository.findById(userId);
	        return optionalUser.get();
	}



    @Override
    public User updateUser(User user) {
        User existingUser = UserManageRepository.findById(user.getId()).get();
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        existingUser.setMobile(user.getMobile());
        existingUser.setPassword(user.getPassword());
        existingUser.setJobRole(user.getJobRole());
        User updatedUser = UserManageRepository.save(existingUser);
        return updatedUser;
    }

    @Override
    public void deleteUser(Long userId) {
    	UserManageRepository.deleteById(userId);
    }

}
