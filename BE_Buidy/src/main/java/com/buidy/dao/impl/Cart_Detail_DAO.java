package com.buidy.dao.impl;

import java.util.List;

import com.buidy.dao.ICart_Detail_DAO;
import com.buidy.dao.IProduct_DAO;
import com.buidy.mapper.RowMapper;
import com.buidy.mapper.impl.Cart_Details_Mapper;
import com.buidy.mapper.impl.Product_Type_Mapper;
import com.buidy.model.Cart_Details_Model;
import com.buidy.model.Product_Model;

public class Cart_Detail_DAO extends Abstract_DAO<Cart_Details_Model> implements ICart_Detail_DAO{
private RowMapper<Cart_Details_Model> rowMapper ;
	
	public Cart_Detail_DAO() {
		rowMapper = new Cart_Details_Mapper();
	}

	@Override
	public void addCartItems(List<Cart_Details_Model> listItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCartItems(List<Cart_Details_Model> listItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCartItem(List<Cart_Details_Model> listItemID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cart_Details_Model> getCartItems(String cardID) {
		// TODO Auto-generated method stub
		return null;
	}
}
