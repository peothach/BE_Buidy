package com.buidy.mapper.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.buidy.mapper.RowMapper;
import com.buidy.model.Discount_Model;

public class Discount_Mapper implements RowMapper<Discount_Model>{

	@Override
	public Discount_Model mapRow(ResultSet rs, Object... parameters) {
		try {
			Discount_Model model = new Discount_Model();
			model.setDiscount_value(rs.getInt("discount_value"));
			return model;
		}catch(SQLException e) {
			return null;
		}
	}

}
