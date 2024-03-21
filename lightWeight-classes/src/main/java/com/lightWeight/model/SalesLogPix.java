package com.lightWeight.model;

import java.sql.Date;

import jakarta.persistence.Entity;

@Entity
public class SalesLogPix extends SalesLog{
	private String pixKey;

	public SalesLogPix(int idSale, int idBuyer, int idProduct, Double totalPrice, Double unitPrice, int ammount,
			int discount, Date date, String pixKey) {
		super(idSale, idBuyer, idProduct, totalPrice, unitPrice, ammount, discount, date);
		this.pixKey = pixKey;
	}

	public String getPixKey() {
		return pixKey;
	}

	public void setPixKey(String pixKey) {
		this.pixKey = pixKey;
	}
	
	
}
