package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import User.User;
import services.UserService;

@RestController
//@ComponentScan(basePackageClasses = UserService.class)
public class UserController {
	
//	User user = new User("Hello", "World");
//	private List<User> users = 
//			new ArrayList<User>();
	@Autowired
	private UserService userService;
	
//	@Autowired(required = true)
//	private UserRepository userRepository;
	
	
	@GetMapping(value = "/users")
	public List<User> getAllUsers(){
//		return this.userService.getAllUsers();
		return this.userService.getAllUsers();
	}

}
