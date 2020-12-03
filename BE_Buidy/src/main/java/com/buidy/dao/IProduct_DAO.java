package com.buidy.dao;

import java.util.List;

import com.buidy.model.Product_Model;

public interface IProduct_DAO extends IGenericDAO<Product_Model>{
	
	List<Product_Model> findAll();
	
	List<Product_Model> findByProductTypeName(String product_type_name);
	
	List<Product_Model> findByHot();
	
	List<Product_Model> findByNew();
	
	List<Product_Model> fingByKeyword(String keyword);
	
	List<Product_Model> findByID(String productID);
}
