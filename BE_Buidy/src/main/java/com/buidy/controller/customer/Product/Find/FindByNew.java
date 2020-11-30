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
 * Servlet implementation class FindNewProDuct_12
 */
@WebServlet("/FindByNew")
public class FindByNew extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Gson gson = new Gson();
	
	private IProduct_Service product_service = new Product_Service();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindByNew() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		List<Product_Model> list = product_service.findProductByNew();
		
		out.print(gson.toJson(list));
		
		// Now clear the stream 
        // using flush() method
		out.flush();
	}


}
