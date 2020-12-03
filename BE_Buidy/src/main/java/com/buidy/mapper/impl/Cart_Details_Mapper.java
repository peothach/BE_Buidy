package com.buidy.mapper.impl;

import java.sql.ResultSet;
import java.util.List;

import com.buidy.dao.ICart_Detail_DAO;
import com.buidy.dao.IDiscount_DAO;
import com.buidy.dao.IProduct_DAO;
import com.buidy.dao.IProduct_Image_DAO;
import com.buidy.dao.IProduct_Type_DAO;
import com.buidy.dao.impl.Discount_DAO;
import com.buidy.dao.impl.Product_DAO;
import com.buidy.dao.impl.Product_Image_DAO;
import com.buidy.dao.impl.Product_Type_DAO;
import com.buidy.mapper.RowMapper;
import com.buidy.model.Cart_Details_Model;
import com.buidy.model.Discount_Model;
import com.buidy.model.Product_Image_Model;
import com.buidy.model.Product_Model;
import com.buidy.model.Product_Type_Model;


public class Cart_Details_Mapper  implements RowMapper<Cart_Details_Model>{
	private IProduct_DAO product_DAO;
	private IProduct_Image_DAO product_image_DAO;
	private IDiscount_DAO discount_DAO;
	private IProduct_Type_DAO product_type_DAO;
	private ICart_Detail_DAO cart_detail_dao;
	@Override
	public Cart_Details_Model mapRow(ResultSet rs, Object... parameters) {
		product_DAO = new Product_DAO();
		product_image_DAO = new Product_Image_DAO();
		discount_DAO = new Discount_DAO();
		product_type_DAO = new Product_Type_DAO();
		
		try {
			Cart_Details_Model model = new Cart_Details_Model();
			Product_Model listproduct = (Product_Model) product_DAO.findByID(String.valueOf(rs.getInt("idProduct")));
			model.setIdCart(rs.getInt("idCart"));
			model.setIdUser(rs.getInt("idUser"));
			model.setQuantity(rs.getInt("quantity"));
			model.setTotal(rs.getFloat("total"));
			model.setIdProduct(rs.getInt("idProduct"));
			List<Product_Image_Model> list_product_image = product_image_DAO.findByProduct(listproduct.getProduct_id());
			List<Discount_Model> list_discount = discount_DAO.findByProductID(listproduct.getProduct_id());
			List<Product_Type_Model> list_product_type = product_type_DAO.findProTypeByProID(listproduct.getProduct_id()); 
			model.setCreatedAt(rs.getTimestamp("createdAt"));
			model.setUpdatedAt(rs.getTimestamp("updatedAt"));
			return model;
		} catch(Exception e) {
			return null;
		}
		
	}

}
