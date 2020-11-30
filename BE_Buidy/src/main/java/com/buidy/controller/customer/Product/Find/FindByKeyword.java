package com.buidy.controller.customer.Product.Find;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.buidy.model.Find_Model;
import com.buidy.service.IProduct_Service;
import com.buidy.service.impl.Product_Service;
import com.google.gson.Gson;

/**
 * Servlet implementation class FindByKeyword
 */
@WebServlet("/FindByKeyword")
public class FindByKeyword extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Gson gson = new Gson();
	
	private IProduct_Service product_service= new Product_Service();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindByKeyword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		request.setCharacterEncoding("UTF-8");

		response.setContentType("application/json");

		response.setCharacterEncoding("UTF-8");
		
		BufferedReader reader = request.getReader();
		
		if(reader.ready()) {
			
			Find_Model model = gson.fromJson(reader, Find_Model.class);
						
			out.print(this.gson.toJson(product_service.findByKeyword(model.getKeyword())));
			out.flush();
		}
	}


}
