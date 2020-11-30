package com.buidy.service;

import java.util.List;

import com.buidy.model.Product_Type_Model;

public interface IProduct_Type_Service {
	
	List<Product_Type_Model> findByName(String product_type_name);
}
