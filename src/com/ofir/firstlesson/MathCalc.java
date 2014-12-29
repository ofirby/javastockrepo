package com.ofir.firstlesson;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public class MathCalc extends HttpServlet  {

//  Circle variables	
	double radius = 50; //  Radios variables
	int radiusResult;
	
//  Triangle variables	
	double degrees = 30; // Angle B
	double oppositelength; // Rib AC
	double hypotenuse = 50; // Rib AB
	double result;

// Print variables
	String line1;
	String line2;
	String line3;
	String resultStr;
	

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

//====================================================================		
//			Calculate circle area
//====================================================================	
				
		radiusResult = (int)(radius * radius * Math.PI);
		line1 = new String("calculation 1: Area of circle with radius  "+ radius + " = " + radiusResult);		

//====================================================================		
//	 Calculate the length of triangle’s ‘opposite’ where angle B is 30
//	 degrees and the ‘hypotenuse’ length is 50 cm.
//====================================================================	
		result =  Math.sin(Math.toRadians(degrees));
		oppositelength = result * 50;
		
		line2 = new String("calculation 2: Length of opposite where angle B is  " + degrees + " =  " + oppositelength);
	

//====================================================================	
//				Power of 20 with exp of 13
//====================================================================	
	
		
	
		resultStr = line1 + "<br>" + line2 + "<br>";
	
	resp.setContentType("text/html");
	//resp.getWriter().println("Hello my new Servlet" + temp );
	resp.getWriter().println(resultStr);
			 
			}
}
			
