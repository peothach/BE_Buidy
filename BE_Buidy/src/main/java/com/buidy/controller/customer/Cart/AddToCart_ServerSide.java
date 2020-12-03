package com.buidy.controller.customer.Cart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.buidy.model.Cart_Model;
import com.buidy.model.Product_Model;
import com.buidy.service.ICart_Details_Service;
import com.buidy.service.ICart_Service;
import com.buidy.service.impl.Cart_Details_Service;
import com.buidy.service.impl.Cart_Service;
import com.google.gson.Gson;

@WebServlet("/AddToCart")
public class AddToCart_ServerSide extends HttpServlet{
private static final long serialVersionUID = 1L;
	
	private Gson gson = new Gson();
	
	private ICart_Service cart_service = new Cart_Service();
	
	private ICart_Details_Service cartDetail_service = new Cart_Details_Service();
	public AddToCart_ServerSide() {
        super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");

		response.setCharacterEncoding("UTF-8");
		Cart_Model model = new Cart_Model();;
	    Date date = new Date();  
		model.setCreatedAt((Timestamp) date);
		model.setUpdatedAt((Timestamp) date);
		cart_service.createCart(model);
        List<Cart_Model> list = cart_service.getCart("3");
		
		out.print(gson.toJson(list));
		
		// Now clear the stream 
        // using flush() method
		out.flush();
	}
	
}
