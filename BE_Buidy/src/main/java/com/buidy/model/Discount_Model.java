package com.buidy.model;

import java.sql.Timestamp;
import java.util.List;

public class Discount_Model {
	
	private Integer discount_id;
	private String discount_code;
	private Integer discount_value;
	private Timestamp discount_day_start;
	private Timestamp discount_day_end;
	private List<Pro_Discount_Model> list_pro_discount;
	
	public List<Pro_Discount_Model> getList_pro_discount() {
		return list_pro_discount;
	}
	public void setList_pro_discount(List<Pro_Discount_Model> list_pro_discount) {
		this.list_pro_discount = list_pro_discount;
	}
	public int getDiscount_id() {
		return discount_id;
	}
	public void setDiscount_id(int discount_id) {
		this.discount_id = discount_id;
	}
	public String getDiscount_code() {
		return discount_code;
	}
	public void setDiscount_code(String discount_code) {
		this.discount_code = discount_code;
	}
	public int getDiscount_value() {
		return discount_value;
	}
	public void setDiscount_value(int discount_value) {
		this.discount_value = discount_value;
	}
	public Timestamp getDiscount_day_start() {
		return discount_day_start;
	}
	public void setDiscount_day_start(Timestamp discount_day_start) {
		this.discount_day_start = discount_day_start;
	}
	public Timestamp getDiscount_day_end() {
		return discount_day_end;
	}
	public void setDiscount_day_end(Timestamp discount_day_end) {
		this.discount_day_end = discount_day_end;
	}
	
	
	
}
