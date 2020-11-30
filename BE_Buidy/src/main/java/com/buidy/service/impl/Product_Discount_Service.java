package com.buidy.service.impl;

import java.util.List;

import com.buidy.dao.IDiscount_DAO;
import com.buidy.dao.impl.Discount_DAO;
import com.buidy.model.Discount_Model;
import com.buidy.service.IProduct_Discount_Service;

public class Product_Discount_Service implements IProduct_Discount_Service{
	
	private IDiscount_DAO discount_DAO;

	@Override
	public List<Discount_Model> findByProductID(Integer id) {
		
		discount_DAO = new Discount_DAO();
				
		return discount_DAO.findByProductID(id);
	}

}
