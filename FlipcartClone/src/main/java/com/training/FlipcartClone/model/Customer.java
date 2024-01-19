package com.training.FlipcartClone.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
@Id
@Column
//@GeneratedValue(strategy=GenerationType.AUTO)
//@SequenceGenerator(name="customer_seq",sequenceName="customer_seq",allocationSize = 1)
private int id;
@Column
private String userName;
@Column
private String password;
@Column
private String mobile;
@Column
private String address;
@Column
private String mail;
public Customer() {
	super();
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}


}
