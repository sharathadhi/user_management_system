package com.usermanagement.controller;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.usermanagement.entity.User;
import com.usermanagement.service.UserManageService;


@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserManageController {

	@Autowired
	 private UserManageService userManageService;
	 
	 @PostMapping
	    public ResponseEntity<User> createUser(@RequestBody User user){
	        User savedUser = userManageService.createUser(user);
	        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
	    }
	 
	  @GetMapping("{id}")
	    public ResponseEntity<User> getUserById(@PathVariable("id") Long userId){
	        User user = userManageService.getUserById(userId);
	        return new ResponseEntity<>(user, HttpStatus.OK);
	    }
	  
	  
	  @PutMapping("{id}")
	    public ResponseEntity<User> updateUser(@PathVariable("id") Long userId,
	                                           @RequestBody User user){
	        user.setId(userId);
	        User updatedUser = userManageService.updateUser(user);
	        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
	    }
	  
	  @DeleteMapping("{id}")
	    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
		  userManageService.deleteUser(userId);
	        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
	    }
	  
	 
}
