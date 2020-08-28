package br.com.oauth2.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.oauth2.poc.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
