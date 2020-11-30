package com.buidy.model;

import java.util.List;

public class Properties_Detail_Model {
	
	private int properties_detail_id;
	private String properties_detail_code;
	private String properties_detail_name;
	private int properties_id;
	private List<Pro_Properties_Detail_Model> list_pro_properties_detail;
	
	public int getProperties_detail_id() {
		return properties_detail_id;
	}
	public void setProperties_detail_id(int properties_detail_id) {
		this.properties_detail_id = properties_detail_id;
	}
	public String getProperties_detail_code() {
		return properties_detail_code;
	}
	public void setProperties_detail_code(String properties_detail_code) {
		this.properties_detail_code = properties_detail_code;
	}
	public String getProperties_detail_name() {
		return properties_detail_name;
	}
	public void setProperties_detail_name(String properties_detail_name) {
		this.properties_detail_name = properties_detail_name;
	}
	public int getProperties_id() {
		return properties_id;
	}
	public void setProperties_id(int properties_id) {
		this.properties_id = properties_id;
	}
	public List<Pro_Properties_Detail_Model> getList_pro_properties_detail() {
		return list_pro_properties_detail;
	}
	public void setList_pro_properties_detail(List<Pro_Properties_Detail_Model> list_pro_properties_detail) {
		this.list_pro_properties_detail = list_pro_properties_detail;
	}
}
