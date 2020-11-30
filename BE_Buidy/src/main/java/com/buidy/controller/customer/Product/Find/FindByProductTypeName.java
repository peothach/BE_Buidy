package com.buidy.controller.customer.Product.Find;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.buidy.model.Product_Model;
import com.buidy.model.Product_Type_Model;
import com.buidy.service.IProduct_Service;
import com.buidy.service.impl.Product_Service;
import com.google.gson.Gson;

/**
 * Servlet implementation class FindAllProductByType
 */
@WebServlet("/FindByProductTypeName")
public class FindByProductTypeName extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private IProduct_Service product_service;

	private Gson gson = new Gson();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FindByProductTypeName() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();

		product_service = new Product_Service();

		request.setCharacterEncoding("UTF-8");

		response.setContentType("application/json");

		response.setCharacterEncoding("UTF-8");
		
		BufferedReader reader = request.getReader();
				
		if(reader.ready()) {
				
			Product_Type_Model model = gson.fromJson(reader, Product_Type_Model.class);
			
			List<Product_Model> list = product_service.findByProductTypeName(model.getProduct_type_name());
			
			String listToString = this.gson.toJson(list);
			
			out.print(listToString);
			
			out.flush();
		}

	}

}
