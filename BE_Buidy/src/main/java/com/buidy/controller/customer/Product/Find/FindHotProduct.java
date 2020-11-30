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
 * Servlet implementation class FindHotProduct_12
 */
@WebServlet("/FindHotProduct")
public class FindHotProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IProduct_Service product_service= new Product_Service();
	private Gson gson = new Gson();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindHotProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		request.setCharacterEncoding("UTF-8");
		
		response.setContentType("application/json");
		
		response.setCharacterEncoding("UTF-8");
		
		List<Product_Model> list = product_service.findProductByHot();
		
		out.print(gson.toJson(list));
		
		out.flush();
		
	}


}
