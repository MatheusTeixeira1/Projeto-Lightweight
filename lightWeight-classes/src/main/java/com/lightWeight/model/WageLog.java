package com.lightWeight.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class WageLog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idWageLog;
	private int idEmploee;
	private Double wage;
	private Date date;
	private Long bankNumber;
	private Long agency;
	private Long emploeeAccount;
	
	
	
	public WageLog(int idEmploee, Double wage, Date date, Long bankNumber, Long agency, Long emploeeAccount) {
		super();
		this.idEmploee = idEmploee;
		this.wage = wage;
		this.date = date;
		this.bankNumber = bankNumber;
		this.agency = agency;
		this.emploeeAccount = emploeeAccount;
	}
	
	
	
	public int getIdEmploee() {
		return idEmploee;
	}
	public void setIdEmploee(int idEmploee) {
		this.idEmploee = idEmploee;
	}
	public Double getWage() {
		return wage;
	}
	public void setWage(Double wage) {
		this.wage = wage;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getBankNumber() {
		return bankNumber;
	}
	public void setBankNumber(Long bankNumber) {
		this.bankNumber = bankNumber;
	}
	public Long getAgency() {
		return agency;
	}
	public void setAgency(Long agency) {
		this.agency = agency;
	}
	public Long getEmploeeAccount() {
		return emploeeAccount;
	}
	public void setEmploeeAccount(Long emploeeAccount) {
		this.emploeeAccount = emploeeAccount;
	}
}
