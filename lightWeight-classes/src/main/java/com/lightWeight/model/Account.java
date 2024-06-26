package com.lightWeight.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idConta;
	
	private String firstname;
	private String surname;
	private String nickname;
	private String cpf;
	private String email;
	private String phoneNumber;
	
	//---Constructor---
	
	public Account(int idConta, String nickname, String firstname, String surname, String cpf, String email,
			String phoneNumber) {
		super();
		this.idConta = idConta;
		this.firstname = firstname;
		this.nickname = nickname;
		this.surname = surname;
		this.cpf = cpf;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	//--Getters and Setters---
	
	public int getIdConta() {
		return idConta;
	}
	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	
}
