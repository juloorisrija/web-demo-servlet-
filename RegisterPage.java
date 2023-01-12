package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterPage
 */
@WebServlet("/RegisterPage")
public class RegisterPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegisterPage() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 try {
	            Class.forName("com.mysql.cj.jdbc.Driver"); 

	            //Scanner sc = new Scanner(System.in);
	            String url = "jdbc:mysql://localhost:3306/infinite";
	            String user = "root";
	            String pass = "India@123";
	           Connection con = DriverManager.getConnection(url,user,pass);
	            Statement stmt = con.createStatement();
	           
	            String data="Insert INTO register values(?,?,?)";
	            PreparedStatement ps=con.prepareStatement(data);
	            ps.setString(1,request.getParameter("username"));
	            ps.setString(2,request.getParameter("userid"));
	            ps.setString(3,request.getParameter("phno"));
	            int count=ps.executeUpdate();
	            ps.close();
	            stmt.close();
	            con.close();

	            response.setContentType("text/html");    
	            PrintWriter out=response.getWriter();
	            out.println("succesfully registerd<br>");
	            out.println("<a href='Login.jsp'>Loign</a>");






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
