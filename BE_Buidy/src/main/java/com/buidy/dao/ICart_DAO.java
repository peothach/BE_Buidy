package com.buidy.dao;

import java.util.List;


import com.buidy.model.Cart_Model;

public interface ICart_DAO extends IGenericDAO<Cart_Model> {
	void createCart(Cart_Model cart);
	void removeCart(String cartID);
	List<Cart_Model> getCart(String cartID);
}
