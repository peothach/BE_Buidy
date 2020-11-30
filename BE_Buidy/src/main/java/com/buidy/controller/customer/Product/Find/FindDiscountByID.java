package com.buidy.controller.customer.Product.Find;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.buidy.service.IProduct_Discount_Service;
import com.buidy.service.impl.Product_Discount_Service;
import com.google.gson.Gson;

/**
 * Servlet implementation class FindProductDiscount
 */
@WebServlet("/FindDiscountByID")
public class FindDiscountByID extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IProduct_Discount_Service product_discount_service;
	
	private Gson gson = new Gson();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindDiscountByID() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		product_discount_service = new Product_Discount_Service();
		
		PrintWriter out = response.getWriter();
		
		out.print(this.gson.toJson(product_discount_service.findByProductID(1)));
		
		out.flush();
	}


}
