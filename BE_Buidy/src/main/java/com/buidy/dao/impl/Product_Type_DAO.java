package com.buidy.dao.impl;

import java.util.List;

import com.buidy.dao.IProduct_Type_DAO;
import com.buidy.mapper.RowMapper;
import com.buidy.mapper.impl.Product_Type_Mapper;
import com.buidy.model.Product_Type_Model;

public class Product_Type_DAO extends Abstract_DAO<Product_Type_Model> implements IProduct_Type_DAO{
	
	private RowMapper<Product_Type_Model> rowMapper ;
	
	public Product_Type_DAO() {
		rowMapper = new Product_Type_Mapper();
	}

	@Override
	public List<Product_Type_Model> findByName(String product_type_name) {
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT product_type_id FROM product_type WHERE product_type_name");
		sql.append(" = ? AND product_type_status = 1");
		
		return query(sql.toString(), rowMapper, product_type_name);
	}

	@Override
	public List<Product_Type_Model> findProTypeByProID(Integer product_id) {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT product_type.product_type_name FROM pro_type_pro JOIN product_type");
		sql.append(" ON pro_type_pro.product_type_id = product_type.product_type_id WHERE product_id = ?");
		
		return query(sql.toString(), rowMapper, product_id);
	}

}
