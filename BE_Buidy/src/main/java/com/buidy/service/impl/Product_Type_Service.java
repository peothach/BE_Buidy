package com.buidy.service.impl;

import java.util.List;

import com.buidy.dao.IProduct_Type_DAO;
import com.buidy.dao.impl.Product_Type_DAO;
import com.buidy.model.Product_Type_Model;
import com.buidy.service.IProduct_Service;
import com.buidy.service.IProduct_Type_Service;

public class Product_Type_Service implements IProduct_Type_Service{

	@Override
	public List<Product_Type_Model> findByName(String product_type_name) {
		
		IProduct_Type_DAO product_type_DAO = new Product_Type_DAO();
		
		return product_type_DAO.findByName(product_type_name);
	}

}
