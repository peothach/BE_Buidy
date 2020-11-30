package com.buidy.service;

import java.util.List;

import com.buidy.model.Product_Image_Model;

public interface IProduct_Image_Service {
	
	List<Product_Image_Model> findById(Integer id);
}
