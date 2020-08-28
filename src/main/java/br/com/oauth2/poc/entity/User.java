package br.com.oauth2.poc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AD_USER")
public class User {

	
	public User() {
		
	}
	
	public User(String nome, String email, String password) {
		this.nome = nome;
		this.email = email;
		this.password = password;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nome", length = 255, nullable = false)
	private String nome;
	
	@Column(name = "email", length = 255, nullable = false)
	private String email;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
