package com.buidy.service.impl;

import java.util.List;

import com.buidy.dao.ICart_Detail_DAO;
import com.buidy.dao.impl.Cart_Detail_DAO;
import com.buidy.model.Cart_Details_Model;
import com.buidy.service.ICart_Details_Service;


public class Cart_Details_Service implements ICart_Details_Service{
	private ICart_Detail_DAO cartDetail_Service;
	
	public Cart_Details_Service(){
		cartDetail_Service = new Cart_Detail_DAO();
	}
	
	@Override
	public void addCartItems(List<Cart_Details_Model> listItem){
		cartDetail_Service.addCartItems(listItem);
	}
	
	@Override
	public void updateCartItems(List<Cart_Details_Model> listItem){
		cartDetail_Service.updateCartItems(listItem);
	}
	
	@Override
	public void removeCartItem(List<Cart_Details_Model> listItemID) {
		cartDetail_Service.removeCartItem(listItemID);
	}

	@Override
	public List<Cart_Details_Model> getCartItems(String cartID) {
		return cartDetail_Service.getCartItems(cartID);
	
	}
}
