package com.buidy.mapper.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.buidy.mapper.RowMapper;
import com.buidy.model.Product_Image_Model;

public class Product_Image_Mapper implements RowMapper<Product_Image_Model>{

	@Override
	public Product_Image_Model mapRow(ResultSet rs, Object... parameters) {
		try {
			Product_Image_Model model = new Product_Image_Model();
			model.setProduct_image_status(rs.getInt("product_image_status"));
			model.setProduct_image_link(rs.getString("product_image_link"));
			return model;
		}catch(SQLException e) {
			return null;
		}
	}

}
