package com.buidy.controller.customer.Product.Find;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.buidy.model.Product_Model;
import com.buidy.service.IProduct_Service;
import com.buidy.service.impl.Product_Service;
import com.google.gson.Gson;

/**
 * Servlet implementation class FindAllProduct
 */
@WebServlet("/FindAllProduct")
public class FindAllProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Gson gson = new Gson();
	private IProduct_Service productService ;
    /**
     * Default constructor. 
     */
    public FindAllProduct() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		productService = new Product_Service();
		
		request.setCharacterEncoding("UTF-8");
		
		response.setContentType("application/json");
		
		response.setCharacterEncoding("UTF-8");
		
		List<Product_Model> list = productService.findAll();
		
		String listToString = this.gson.toJson(list);
		
		out.print(listToString);
		
		out.flush();
		
		
	}


}
