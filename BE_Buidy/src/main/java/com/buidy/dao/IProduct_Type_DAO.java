package com.buidy.dao;

import java.util.List;

import com.buidy.model.Product_Type_Model;

public interface IProduct_Type_DAO extends IGenericDAO<Product_Type_Model>{
	
	List<Product_Type_Model> findByName(String product_type_name);
	
	List<Product_Type_Model> findProTypeByProID(Integer product_id);
}
