package com.lightWeight.model;

import java.sql.Date;

import jakarta.persistence.Entity;

@Entity
public class SalesLogCreditcard extends SalesLog{
	private String cardNumber;
	private String expirationDate;
	private String cvv;
	private String nameOnCard;
	
	
	
	public SalesLogCreditcard(int idSale, int idBuyer, int idProduct, Double totalPrice, Double unitPrice, int ammount,
			int discount, Date date, String cardNumber, String expirationDate, String cvv, String nameOnCard) {
		super(idSale, idBuyer, idProduct, totalPrice, unitPrice, ammount, discount, date);
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.cvv = cvv;
		this.nameOnCard = nameOnCard;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	
}
