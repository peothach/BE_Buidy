package com.buidy.model;

import java.sql.Timestamp;
import java.util.List;

public class Cart_Model {
	private int idCart;
	List<Cart_Details_Model> list_cart_detail;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	public int getIdCart() {
		return idCart;
	}
	public void setIdCart(int idCart) {
		this.idCart = idCart;
	}
	public List<Cart_Details_Model> getList_cart_detail() {
		return list_cart_detail;
	}
	public void setList_cart_detail(List<Cart_Details_Model> list_cart_detail) {
		this.list_cart_detail = list_cart_detail;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
}
