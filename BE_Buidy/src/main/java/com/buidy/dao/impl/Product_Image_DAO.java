package com.buidy.dao.impl;

import java.util.List;

import com.buidy.dao.IProduct_Image_DAO;
import com.buidy.mapper.RowMapper;
import com.buidy.mapper.impl.Product_Image_Mapper;
import com.buidy.model.Product_Image_Model;

public class Product_Image_DAO extends Abstract_DAO<Product_Image_Model> implements IProduct_Image_DAO{

	RowMapper<Product_Image_Model> rowMapper;
	
	@Override
	public List<Product_Image_Model> findByProduct(Integer id) {
		
		rowMapper = new Product_Image_Mapper();
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT product_image.product_image_status,product_image.product_image_link FROM product JOIN product_image");
		sql.append(" ON product.product_id = product_image.product_id WHERE product.product_id = ?");
		
		//String sql1 = "SELECT product_image.product_image_link FROM product JOIN product_image ON product.product_id = product_image.product_id WHERE product.product_id = 1";
		
		return query(sql.toString(), rowMapper, id);
	}

}
