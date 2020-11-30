package com.buidy.dao;

import java.util.List;

import com.buidy.model.Product_Image_Model;

public interface IProduct_Image_DAO extends IGenericDAO<Product_Image_Model>{
	
	List<Product_Image_Model> findByProduct(Integer id);

}
