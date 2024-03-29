package com.training.FlipcartClone.model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Order {
@Id
@Column

@GeneratedValue(strategy=GenerationType.TABLE)
private int id;
@Column
private String paymentMode;
@Column
private Date orderDate;
@Column
private Date deliveryDate;
@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="customer")
private Customer customer;

@OneToOne
@JoinColumn(name="product_id")
private Product product;

public Order() {
	super();
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getPaymentMode() {
	return paymentMode;
}

public void setPaymentMode(String paymentMode) {
	this.paymentMode = paymentMode;
}

public Date getOrderDate() {
	return orderDate;
}

public void setOrderDate(Date orderDate) {
	this.orderDate = orderDate;
}

public Date getDeliveryDate() {
	return deliveryDate;
}

public void setDeliveryDate(Date deliveryDate) {
	this.deliveryDate = deliveryDate;
}

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

public Product getProduct() {
	return product;
}

public void setProduct(Product product) {
	this.product = product;
}



}
