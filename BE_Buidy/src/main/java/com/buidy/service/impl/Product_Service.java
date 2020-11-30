package com.buidy.service.impl;

import java.util.List;

import com.buidy.dao.IProduct_DAO;
import com.buidy.dao.impl.Product_DAO;
import com.buidy.model.Product_Model;
import com.buidy.service.IProduct_Service;

public class Product_Service implements IProduct_Service{

	private IProduct_DAO productDAO;
	
	public Product_Service() {
		productDAO = new Product_DAO();
	}
	
	@Override
	public List<Product_Model> findAll() {
		return productDAO.findAll();
	}

	@Override
	public List<Product_Model> findByProductTypeName(String product_type_name) {
		return productDAO.findByProductTypeName(product_type_name);
	}

	@Override
	public List<Product_Model> findProductByHot() {
		return productDAO.findByHot();
	}

	@Override
	public List<Product_Model> findProductByNew() {
		return productDAO.findByNew();
	}

	@Override
	public List<Product_Model> findByKeyword(String keyword) {
		return productDAO.fingByKeyword(keyword);
	}
}
