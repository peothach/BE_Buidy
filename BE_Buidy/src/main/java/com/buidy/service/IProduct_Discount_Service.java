package com.buidy.service;

import java.util.List;

import com.buidy.model.Discount_Model;

public interface IProduct_Discount_Service {
	
	List<Discount_Model> findByProductID(Integer id);
}
