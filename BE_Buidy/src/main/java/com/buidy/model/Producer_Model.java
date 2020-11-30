package com.buidy.model;

import java.util.List;

public class Producer_Model {
	
	private int producer_id;
	private String producer_code;
	private String producer_name;
	private String producer_address;
	private String producer_phone;
	private String producer_email;
	private String producer_status;
	private List<Product_Model> list_product;
	public int getProducer_id() {
		return producer_id;
	}
	public void setProducer_id(int producer_id) {
		this.producer_id = producer_id;
	}
	public String getProducer_code() {
		return producer_code;
	}
	public void setProducer_code(String producer_code) {
		this.producer_code = producer_code;
	}
	public String getProducer_name() {
		return producer_name;
	}
	public void setProducer_name(String producer_name) {
		this.producer_name = producer_name;
	}
	public String getProducer_address() {
		return producer_address;
	}
	public void setProducer_address(String producer_address) {
		this.producer_address = producer_address;
	}
	public String getProducer_phone() {
		return producer_phone;
	}
	public void setProducer_phone(String producer_phone) {
		this.producer_phone = producer_phone;
	}
	public String getProducer_email() {
		return producer_email;
	}
	public void setProducer_email(String producer_email) {
		this.producer_email = producer_email;
	}
	public String getProducer_status() {
		return producer_status;
	}
	public void setProducer_status(String producer_status) {
		this.producer_status = producer_status;
	}
	public List<Product_Model> getList_product() {
		return list_product;
	}
	public void setList_product(List<Product_Model> list_product) {
		this.list_product = list_product;
	}
	
}
