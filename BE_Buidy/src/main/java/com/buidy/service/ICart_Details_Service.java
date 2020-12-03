package com.buidy.service;

import java.util.List;

import com.buidy.model.Cart_Details_Model;

public interface ICart_Details_Service {
	void addCartItems(List<Cart_Details_Model> listItem);
	void updateCartItems(List<Cart_Details_Model> listItem);
	List<Cart_Details_Model> getCartItems(String cardID);
	void removeCartItem(List<Cart_Details_Model> listItemID);
}
