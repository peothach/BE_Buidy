package com.buidy.service;

import java.util.List;

import com.buidy.model.Cart_Model;

public interface ICart_Service {
	void createCart(Cart_Model cart);
	void removeCart(String cartID);
	List<Cart_Model> getCart(String cartID);
}
