package com.buidy.dao;

import java.util.List;

import com.buidy.model.Cart_Details_Model;

public interface ICart_Detail_DAO extends IGenericDAO<Cart_Details_Model> {
	void addCartItems(List<Cart_Details_Model> listItem);
	void updateCartItems(List<Cart_Details_Model> listItem);
	List<Cart_Details_Model> getCartItems(String cartID);
	void removeCartItem(List<Cart_Details_Model> listItemID);
}
