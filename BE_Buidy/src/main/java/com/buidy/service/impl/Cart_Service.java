package com.buidy.service.impl;

import java.util.List;

import com.buidy.dao.ICart_DAO;
import com.buidy.dao.impl.Cart_DAO;
import com.buidy.model.Cart_Model;
import com.buidy.service.ICart_Service;

public class Cart_Service implements ICart_Service{
	private ICart_DAO cart_service;
	
	public Cart_Service(){
		cart_service = new Cart_DAO();
	}

	@Override
	public void createCart(Cart_Model cart) {
		cart_service.createCart(cart);
	}

	@Override
	public void removeCart(String cartID) {
		cart_service.removeCart(cartID);;
	}

	@Override
	public List<Cart_Model> getCart(String cartID) {
		return cart_service.getCart(cartID);
	}
	
	
}
