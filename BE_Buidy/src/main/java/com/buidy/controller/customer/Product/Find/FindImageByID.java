package com.buidy.controller.customer.Product.Find;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.buidy.service.IProduct_Image_Service;
import com.buidy.service.impl.Product_Image_Service;
import com.google.gson.Gson;

/**
 * Servlet implementation class FindImageByID
 */
@WebServlet("/FindImageByID")
public class FindImageByID extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IProduct_Image_Service product_image_service;
	
	private Gson gson = new Gson();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindImageByID() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		product_image_service = new Product_Image_Service();
		
		PrintWriter out = response.getWriter();
		
		out.print(this.gson.toJson(product_image_service.findById(1)));
		
		out.flush();
		
	}

}
