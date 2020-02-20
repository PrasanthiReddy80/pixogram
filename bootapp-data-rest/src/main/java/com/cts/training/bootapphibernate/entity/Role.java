package com.cts.training.bootapphibernate.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
@Entity
@Table(name="authorities", uniqueConstraints= @UniqueConstraint(columnNames={"username","authority"}))
public class Role  implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="username")
	private String userName;
	@Id
	@Column(name="authority")
	private String role;
	
	
	public Role() {
		// TODO Auto-generated constructor stub
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	
}
	
	
	