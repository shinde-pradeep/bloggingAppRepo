package com.bloggingApp.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bloggingApp.entitiesDtos.UserDto;
import com.bloggingApp.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

//..............................................	

//1.create user...............................	

//http://localhost:8081/api/users/
	@PostMapping ("/")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {	
	
	UserDto createdUser=this.userService.createUser(userDto);
	
		return new ResponseEntity<>(createdUser ,HttpStatus.CREATED);
	}
	
}
