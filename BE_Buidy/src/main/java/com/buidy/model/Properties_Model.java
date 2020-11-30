package com.buidy.model;

import java.util.List;

public class Properties_Model {
	
	private int properties_id;
	private String properties_code;
	private String properties_name;
	private String properties_description;
	private int properties_status;
	private List<Properties_Detail_Model> list_properties_detail;
	
	public int getProperties_id() {
		return properties_id;
	}
	public void setProperties_id(int properties_id) {
		this.properties_id = properties_id;
	}
	public String getProperties_code() {
		return properties_code;
	}
	public void setProperties_code(String properties_code) {
		this.properties_code = properties_code;
	}
	public String getProperties_name() {
		return properties_name;
	}
	public void setProperties_name(String properties_name) {
		this.properties_name = properties_name;
	}
	public String getProperties_description() {
		return properties_description;
	}
	public void setProperties_description(String properties_description) {
		this.properties_description = properties_description;
	}
	public int getProperties_status() {
		return properties_status;
	}
	public void setProperties_status(int properties_status) {
		this.properties_status = properties_status;
	}
	public List<Properties_Detail_Model> getList_properties_detail() {
		return list_properties_detail;
	}
	public void setList_properties_detail(List<Properties_Detail_Model> list_properties_detail) {
		this.list_properties_detail = list_properties_detail;
	}
	
}
