package br.com.oauth2.poc.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.oauth2.poc.entity.User;
import br.com.oauth2.poc.repository.UserRepository;

@Component
public class DataInitializier implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		List<User> users = userRepository.findAll();

		if (users.isEmpty()) {
			this.createUser("Ana", "ana.silva@gmail.com", "123@");
			this.createUser("Bia", "bia.bueno@gmail.com", "123@");
			this.createUser("Carla", "carla.andrade@gmail.com", "123@");
		}
	}

	public void createUser(String nome, String email, String password) {
		User user = new User(nome, email, password);
		userRepository.save(user);
	}

}
