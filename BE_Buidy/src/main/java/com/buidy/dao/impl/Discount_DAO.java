package com.buidy.dao.impl;

import java.util.List;

import com.buidy.dao.IDiscount_DAO;
import com.buidy.mapper.RowMapper;
import com.buidy.mapper.impl.Discount_Mapper;
import com.buidy.model.Discount_Model;

public class Discount_DAO extends Abstract_DAO<Discount_Model> implements IDiscount_DAO{
	
	private RowMapper<Discount_Model> rowMapper;
	
	@Override
	public List<Discount_Model> findByProductID(Integer id) {
		// TODO Auto-generated method stub
		
		rowMapper = new Discount_Mapper();
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT discount.discount_value FROM discount JOIN pro_discount ON discount.discount_id = pro_discount.discount_id");
		sql.append(" WHERE pro_discount.product_id = ? and discount.discount_day_end >= discount.discount_day_start");
		return query(sql.toString(), rowMapper, id);
		
	}

}
