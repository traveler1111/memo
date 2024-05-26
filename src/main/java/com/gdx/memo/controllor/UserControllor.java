package com.gdx.memo.controllor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gdx.memo.entity.User;
import com.gdx.memo.service.UserService;

@RestController
public class UserControllor {
	@Autowired
	private UserService userService;
	@GetMapping("/user")
	public List<User> getAllUser(){
		List<User> allUser=  userService.findAllUser();

		return allUser;
	}
	
	

}
