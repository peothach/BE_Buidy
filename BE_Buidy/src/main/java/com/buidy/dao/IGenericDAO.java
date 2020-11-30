package com.buidy.dao;

import java.util.List;

import com.buidy.mapper.RowMapper;

public interface IGenericDAO<T> {
	
	@SuppressWarnings("hiding")
	<T> List<T> query(String sql, RowMapper<T> rowMapper, Object...parameters);

}
