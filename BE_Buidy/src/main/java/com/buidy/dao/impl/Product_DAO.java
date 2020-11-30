package com.buidy.dao.impl;

import java.util.List;

import com.buidy.dao.IProduct_DAO;
import com.buidy.mapper.RowMapper;
import com.buidy.mapper.impl.Product_Mapper;
import com.buidy.model.Product_Model;

public class Product_DAO extends Abstract_DAO<Product_Model> implements IProduct_DAO{
	
	private RowMapper<Product_Model> rowMapper;
	
	public Product_DAO() {
		rowMapper = new Product_Mapper();
	}

	@Override
	public List<Product_Model> findAll() {
		String sql = "SELECT * FROM product WHERE product_status = 1";
		
		return query(sql, rowMapper);
	}

	@Override
	public List<Product_Model> findByProductTypeName(String product_type_name) {
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT product.* FROM product JOIN pro_type_pro ON product.product_id = pro_type_pro.product_id");
		sql.append(" JOIN product_type ON product_type.product_type_id = pro_type_pro.product_type_id");
		sql.append(" WHERE product_type.product_type_parrent = 2 AND product_type.product_type_name = ?");
		
		return query(sql.toString(), rowMapper, product_type_name);
	}

	@Override
	public List<Product_Model> findByHot() {
		String sql = "SELECT * FROM product WHERE product_status = 1 ORDER BY product.product_purchased DESC LIMIT 12";
		
		return query(sql, rowMapper);
	}

	@Override
	public List<Product_Model> findByNew() {
		String sql = "SELECT * FROM product WHERE product_status = 1 ORDER BY create_at DESC LIMIT 12";
		
		return query(sql, rowMapper);
	}

	@Override
	public List<Product_Model> fingByKeyword(String keyword) {
		StringBuilder sql = new StringBuilder();
		sql.append("CALL `find_by_keyword`(?);");
		return query(sql.toString(), rowMapper, keyword);
	}

}
