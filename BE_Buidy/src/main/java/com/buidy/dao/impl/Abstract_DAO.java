package com.buidy.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.buidy.dao.IGenericDAO;
import com.buidy.mapper.RowMapper;

public class Abstract_DAO<T> implements IGenericDAO<T>{

	ResourceBundle resourceBundle = ResourceBundle.getBundle("db");
	
	public Connection getConnection() {
		try {
			Class.forName(resourceBundle.getString("driverName"));
			String url = resourceBundle.getString("url");
			String user = resourceBundle.getString("user");
			String password = resourceBundle.getString("password");
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
	}
	
	private void setParameter(PreparedStatement statement, Object... parameters) {
		try {
			for(int i = 0; i < parameters.length; i++) {
				Object parameter  = parameters[i];
				int index = i + 1;
				if(parameter instanceof Integer) {
					statement.setInt(index, (Integer) parameter);
				}else if(parameter instanceof String) {
					statement.setString(index, (String) parameter);
				}else if(parameter instanceof Timestamp) {
					statement.setTimestamp(index, (Timestamp) parameter);
				}else if(parameter instanceof Float) {
					statement.setFloat(index, (Float) parameter);
				}
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "hiding" })
	@Override
	public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters) {
		List<T> results = new ArrayList<>();
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			setParameter(statement, parameters);
			resultSet = statement.executeQuery();
			while(resultSet.next()) {
				results.add(rowMapper.mapRow(resultSet));
			}
			return results;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}finally {
			try {
				if(connection != null) {
					connection.close();
				}
				
				if(statement != null) {
					statement.close();
				}
				
				if(resultSet != null) {
					resultSet.close();
				}
				
			}catch(SQLException e) {
				return null;
			}
		}
	}
	

}
