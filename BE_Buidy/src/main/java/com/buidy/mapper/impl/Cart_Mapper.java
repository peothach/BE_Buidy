package com.buidy.mapper.impl;

import java.sql.ResultSet;

import com.buidy.dao.ICart_Detail_DAO;
import com.buidy.dao.impl.Cart_Detail_DAO;
import com.buidy.mapper.RowMapper;
import com.buidy.model.Cart_Model;

public class Cart_Mapper implements RowMapper<Cart_Model>{
	

	@Override
	public Cart_Model mapRow(ResultSet rs, Object... parameters) {
	
		try {
			Cart_Model model = new Cart_Model();
			model.setIdCart(rs.getInt("idCart"));
			model.setCreatedAt(rs.getTimestamp("createdAt"));
			model.setUpdatedAt(rs.getTimestamp("updatedAt"));
			return model;
		}catch(Exception e) {
			return null;
		}
		
	}

}
