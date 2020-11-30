package com.buidy.service.impl;

import java.util.List;

import com.buidy.dao.IProduct_Image_DAO;
import com.buidy.dao.impl.Product_Image_DAO;
import com.buidy.model.Product_Image_Model;
import com.buidy.service.IProduct_Image_Service;

public class Product_Image_Service implements IProduct_Image_Service{
	
	private IProduct_Image_DAO product_image_DAO;
	
	@Override
	public List<Product_Image_Model> findById(Integer id) {
		
		product_image_DAO = new Product_Image_DAO();
		
		return product_image_DAO.findByProduct(id);
	}

}
