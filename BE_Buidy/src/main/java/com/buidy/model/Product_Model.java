package com.buidy.model;

import java.sql.Timestamp;
import java.util.List;

public class Product_Model {
	
	private int product_id;
	private String product_code;
	private String product_name;
	private String product_code_sku;
	private Float product_price;
	private Integer product_amount;
	private String product_description;
	private Integer product_status = null;
	private Integer product_purchased = null;
	private List<Product_Image_Model> list_product_image;
	private List<Product_Type_Model> list_product_type;
	private List<Discount_Model> list_pro_discount;
	private List<Properties_Detail_Model> list_properties_detail;
	private Timestamp create_at;
	private Timestamp update_at;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_code() {
		return product_code;
	}
	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_code_sku() {
		return product_code_sku;
	}
	public void setProduct_code_sku(String product_code_sku) {
		this.product_code_sku = product_code_sku;
	}
	public Float getProduct_price() {
		return product_price;
	}
	public void setProduct_price(Float product_price) {
		this.product_price = product_price;
	}
	public Integer getProduct_amount() {
		return product_amount;
	}
	public void setProduct_amount(Integer product_amount) {
		this.product_amount = product_amount;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public Integer getProduct_status() {
		return product_status;
	}
	public void setProduct_status(Integer product_status) {
		this.product_status = product_status;
	}
	public Integer getProduct_purchased() {
		return product_purchased;
	}
	public void setProduct_purchased(Integer product_purchased) {
		this.product_purchased = product_purchased;
	}
	public List<Product_Image_Model> getList_product_image() {
		return list_product_image;
	}
	public void setList_product_image(List<Product_Image_Model> list_product_image) {
		this.list_product_image = list_product_image;
	}
	public List<Product_Type_Model> getList_product_type() {
		return list_product_type;
	}
	public void setList_product_type(List<Product_Type_Model> list_product_type) {
		this.list_product_type = list_product_type;
	}
	public List<Discount_Model> getList_pro_discount() {
		return list_pro_discount;
	}
	public void setList_pro_discount(List<Discount_Model> list_pro_discount) {
		this.list_pro_discount = list_pro_discount;
	}
	public List<Properties_Detail_Model> getList_properties_detail() {
		return list_properties_detail;
	}
	public void setList_properties_detail(List<Properties_Detail_Model> list_properties_detail) {
		this.list_properties_detail = list_properties_detail;
	}
	public Timestamp getCreate_at() {
		return create_at;
	}
	public void setCreate_at(Timestamp create_at) {
		this.create_at = create_at;
	}
	public Timestamp getUpdate_at() {
		return update_at;
	}
	public void setUpdate_at(Timestamp update_at) {
		this.update_at = update_at;
	}
	
}
