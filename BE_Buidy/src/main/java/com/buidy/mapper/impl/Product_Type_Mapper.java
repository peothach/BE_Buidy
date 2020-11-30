package com.buidy.mapper.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.buidy.mapper.RowMapper;
import com.buidy.model.Product_Type_Model;

public class Product_Type_Mapper implements RowMapper<Product_Type_Model>{

	@Override
	public Product_Type_Model mapRow(ResultSet rs, Object... parameters) {
		try {
			Product_Type_Model model = new Product_Type_Model();
			model.setProduct_type_name(rs.getString("product_type_name"));			
			return model;
		}catch(SQLException e) {
			return null;
		}
	}

}
