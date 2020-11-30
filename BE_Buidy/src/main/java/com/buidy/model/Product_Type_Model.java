package com.buidy.model;

import java.util.List;

public class Product_Type_Model {
	
	private Integer product_type_id;
	private String product_type_code;
	private String product_type_name;
	private String product_type_description;
	private Integer product_type_status;
	private Integer product_type_parrent;
	private List<Pro_Type_Pro_Model> list_pro_type_pro;
	public Integer getProduct_type_id() {
		return product_type_id;
	}
	public void setProduct_type_id(Integer product_type_id) {
		this.product_type_id = product_type_id;
	}
	public String getProduct_type_code() {
		return product_type_code;
	}
	public void setProduct_type_code(String product_type_code) {
		this.product_type_code = product_type_code;
	}
	public String getProduct_type_name() {
		return product_type_name;
	}
	public void setProduct_type_name(String product_type_name) {
		this.product_type_name = product_type_name;
	}
	public String getProduct_type_description() {
		return product_type_description;
	}
	public void setProduct_type_description(String product_type_description) {
		this.product_type_description = product_type_description;
	}
	public Integer getProduct_type_status() {
		return product_type_status;
	}
	public void setProduct_type_status(Integer product_type_status) {
		this.product_type_status = product_type_status;
	}
	public Integer getProduct_type_parrent() {
		return product_type_parrent;
	}
	public void setProduct_type_parrent(Integer product_type_parrent) {
		this.product_type_parrent = product_type_parrent;
	}
	public List<Pro_Type_Pro_Model> getList_pro_type_pro() {
		return list_pro_type_pro;
	}
	public void setList_pro_type_pro(List<Pro_Type_Pro_Model> list_pro_type_pro) {
		this.list_pro_type_pro = list_pro_type_pro;
	}
	
}
