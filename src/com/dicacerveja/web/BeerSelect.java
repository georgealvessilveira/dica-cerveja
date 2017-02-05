package com.dicacerveja.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dicacerveja.model.BeerExpert;

/**
 * Servlet implementation class BeerSelect
 */
@WebServlet("/BeerSelect")
public class BeerSelect extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String color = request.getParameter("color");
		BeerExpert expert = new BeerExpert();
		List<String> result = expert.getBrands(color);
		
		/*response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Beer Selection Advice<br/>");
		brands.forEach(brand -> out.println("<br/>try: " + brand));*/
		
		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}

}
