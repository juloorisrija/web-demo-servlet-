package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loginservlet
 */
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Loginservlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 try {
	            Class.forName("com.mysql.cj.jdbc.Driver"); 
	            String url = "jdbc:mysql://localhost:3306/infinite";
	            String user = "root";
	            String pass = "India@123";
	            PrintWriter out = response.getWriter();
	            Connection con = DriverManager.getConnection(url,user,pass);
	            Statement stmt = con.createStatement();
	            String data="select * from register";
	            PreparedStatement ps=con.prepareStatement(data);
	                boolean flag=false;
	                ResultSet res= ps.executeQuery();
	                while(res.next()) {
	                    if( res.getString(3).equals(request.getParameter("phn"))) {

	                        out.println("successfully logged in");
	                        flag=true;
	                        break;
	                    }
	                }
	                if(flag == false) {
	                    out.println("<h1>"+"IncorectLogin credentials"+"</h1>");
	                }

	         }  
	        catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace(); 
	        }  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
