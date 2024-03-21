package com.lightWeight.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PermissionsEmploee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPermission;
	private int idEmploee;
	private boolean permission1;
	private boolean permission2;
	private boolean permission3;
	private boolean permission4;
	
	
	
	public PermissionsEmploee(int idEmploee, boolean permission1, boolean permission2, boolean permission3,
			boolean permission4) {
		super();
		this.idEmploee = idEmploee;
		this.permission1 = permission1;
		this.permission2 = permission2;
		this.permission3 = permission3;
		this.permission4 = permission4;
	}
	
	
	
	public int getIdEmploee() {
		return idEmploee;
	}
	public void setIdEmploee(int idEmploee) {
		this.idEmploee = idEmploee;
	}
	public boolean isPermission1() {
		return permission1;
	}
	public void setPermission1(boolean permission1) {
		this.permission1 = permission1;
	}
	public boolean isPermission2() {
		return permission2;
	}
	public void setPermission2(boolean permission2) {
		this.permission2 = permission2;
	}
	public boolean isPermission3() {
		return permission3;
	}
	public void setPermission3(boolean permission3) {
		this.permission3 = permission3;
	}
	public boolean isPermission4() {
		return permission4;
	}
	public void setPermission4(boolean permission4) {
		this.permission4 = permission4;
	}
}
