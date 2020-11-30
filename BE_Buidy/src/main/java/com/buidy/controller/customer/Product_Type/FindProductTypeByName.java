package com.buidy.controller.customer.Product_Type;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.buidy.model.Product_Model;
import com.buidy.model.Product_Type_Model;
import com.buidy.service.IProduct_Type_Service;
import com.buidy.service.impl.Product_Type_Service;
import com.google.gson.Gson;

/**
 * Servlet implementation class FindProductTypeByName
 */
@WebServlet("/FindProductTypeByName")
public class FindProductTypeByName extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IProduct_Type_Service product_type_Service;
	
	private Gson gson = new Gson();

    /**
     * Default constructor. 
     */
    public FindProductTypeByName() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		product_type_Service = new Product_Type_Service();
		
		request.setCharacterEncoding("UTF-8");

		response.setContentType("application/json");

		response.setCharacterEncoding("UTF-8");
		
		BufferedReader reader = request.getReader();
		
		if(reader.ready()) {
			Product_Type_Model model = gson.fromJson(reader, Product_Type_Model.class);
						
			List<Product_Type_Model> list = product_type_Service.findByName(model.getProduct_type_name());
			
			model = list.get(0);
						
			String listToString = this.gson.toJson(model);
			
			out.print(listToString);
			
			out.flush();
		}else {
			reader.close();
		}
			
		
	}


}
