package com.buidy.dao.impl;

import java.util.List;

import com.buidy.dao.ICart_DAO;
import com.buidy.mapper.RowMapper;
import com.buidy.model.Cart_Model;


public class Cart_DAO extends Abstract_DAO<Cart_Model> implements ICart_DAO {
	private RowMapper<Cart_Model> rowMapper;

	@Override
	public void createCart(Cart_Model cart) {
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO Cart VALUES (?,?,?) ");
	
			query(sql.toString(), rowMapper, "",cart.getCreatedAt(),cart.getUpdatedAt());
		
		
	}

	@Override
	public void removeCart(String cartID) {
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM cart WHERE idCart = ? ");
		query(sql.toString(), rowMapper, cartID);
		
	}

	@Override
	public List<Cart_Model> getCart(String cartID) {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM cart WHERE idCart = ? ");
		return query(sql.toString(), rowMapper, cartID);

	}
}
