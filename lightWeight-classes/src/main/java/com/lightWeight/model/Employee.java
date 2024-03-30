package com.lightWeight.model;

import jakarta.persistence.Entity;

@Entity
public class Employee extends Account{
	private double wage;
	private String document;
	
	//---Constructor---
	
	public Employee(int idConta, String nickname,String firstname, String surname, String cpf, String email,
			String phoneNumber, double wage, String document) {
		super(idConta, firstname, nickname, surname, cpf, email, phoneNumber);
		this.wage = wage;
		this.document = document;
	}
	
	//--Getters and Setters---
	
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	
}
