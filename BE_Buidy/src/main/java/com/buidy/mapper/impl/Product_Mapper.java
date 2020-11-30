package com.buidy.mapper.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.buidy.dao.IDiscount_DAO;
import com.buidy.dao.IProduct_Image_DAO;
import com.buidy.dao.IProduct_Type_DAO;
import com.buidy.dao.impl.Discount_DAO;
import com.buidy.dao.impl.Product_Image_DAO;
import com.buidy.dao.impl.Product_Type_DAO;
import com.buidy.mapper.RowMapper;
import com.buidy.model.Discount_Model;
import com.buidy.model.Product_Image_Model;
import com.buidy.model.Product_Model;
import com.buidy.model.Product_Type_Model;

public class Product_Mapper implements RowMapper<Product_Model>{
	
	private IProduct_Image_DAO product_image_DAO;
	private IDiscount_DAO discount_DAO;
	private IProduct_Type_DAO product_type_DAO;

	@Override
	public Product_Model mapRow(ResultSet rs, Object... parameters) {
		
		product_image_DAO = new Product_Image_DAO();
		discount_DAO = new Discount_DAO();
		product_type_DAO = new Product_Type_DAO();
		
		try {
			Product_Model model = new Product_Model();
			model.setProduct_id(rs.getInt("product_id"));
			model.setProduct_name(rs.getString("product_name"));
			model.setProduct_price(rs.getFloat("product_price"));
			model.setCreate_at(rs.getTimestamp("create_at"));
			
			List<Product_Image_Model> list_product_image = product_image_DAO.findByProduct(model.getProduct_id());
			List<Discount_Model> list_discount = discount_DAO.findByProductID(model.getProduct_id());
			List<Product_Type_Model> list_product_type = product_type_DAO.findProTypeByProID(model.getProduct_id()); 
			
			model.setList_product_image(list_product_image);
			model.setList_pro_discount(list_discount);
			model.setList_product_type(list_product_type);
			return model;
		}catch(SQLException e) {
			return null;
		}
	}

}
