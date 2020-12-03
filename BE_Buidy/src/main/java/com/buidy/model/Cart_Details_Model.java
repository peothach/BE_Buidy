package com.buidy.model;

import java.sql.Timestamp;
import java.util.List;

public class Cart_Details_Model {
	private int idCart;
	private int idUser;
	private int quantity;
	private float total;
	private int idProduct;
	private List<Product_Model> list_product;
	private List<Product_Image_Model> list_product_image;
	private List<Product_Type_Model> list_product_type;
	private List<Discount_Model> list_pro_discount;
	private List<Properties_Detail_Model> list_properties_detail;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	public int getIdCart() {
		return idCart;
	}
	public void setIdCart(int idCart) {
		this.idCart = idCart;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public List<Product_Model> getList_product() {
		return list_product;
	}
	public void setList_product(List<Product_Model> list_product) {
		this.list_product = list_product;
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
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}
