package com.buidy.dao;

import java.util.List;

import com.buidy.model.Discount_Model;

public interface IDiscount_DAO extends IGenericDAO<Discount_Model>{
	
	List<Discount_Model> findByProductID(Integer id);
}
