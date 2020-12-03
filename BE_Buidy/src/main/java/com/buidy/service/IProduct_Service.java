package com.buidy.service;

import java.util.List;

import com.buidy.model.Product_Model;

public interface IProduct_Service {
	
	List<Product_Model> findAll();
	
	List<Product_Model> findByProductTypeName(String product_type_name);
	
	List<Product_Model> findProductByHot();
	
	List<Product_Model> findProductByNew();
	
	List<Product_Model> findByKeyword(String keyword);
	
	List<Product_Model> findByID(String productID);
}
