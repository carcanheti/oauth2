package br.com.oauth2.poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.oauth2.poc.entity.User;
import br.com.oauth2.poc.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<User> listAll(){
		return userRepository.findAll();
	}
	
	
	
}
