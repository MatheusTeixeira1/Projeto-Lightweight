package com.lightWeight.model;

import java.sql.Date;

import jakarta.persistence.Entity;

@Entity
public class User extends Account{
	private Date last_Date_Of_Membership;
	private Date membership_Expiration_Date;
	
	//---Constructor---
	
	public User(int idConta, String nickname, String surname, String firstname, String cpf, String email,
			String phoneNumber, Date last_Date_Of_Membership, Date membership_Expiration_Date) {
		super(idConta, nickname,firstname, surname, cpf, email, phoneNumber);
		this.last_Date_Of_Membership = last_Date_Of_Membership;
		this.membership_Expiration_Date = membership_Expiration_Date;
	}
	
	//--Getters and Setters---
	
	public Date getLast_Date_Of_Membership() {
		return last_Date_Of_Membership;
	}
	public void setLast_Date_Of_Membership(Date last_Date_Of_Membership) {
		this.last_Date_Of_Membership = last_Date_Of_Membership;
	}
	public Date getMembership_Expiration_Date() {
		return membership_Expiration_Date;
	}
	public void setMembership_Expiration_Date(Date membership_Expiration_Date) {
		this.membership_Expiration_Date = membership_Expiration_Date;
	}
	
}
