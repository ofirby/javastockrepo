package com.ofir.firstlesson;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@SuppressWarnings("serial")
public class MathCalc extends HttpServlet  {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)	throws ServletException, IOException {
	
//  Circle variables	
	double radius = 50; //  Radios variables
	int radiusResult;
	
//  Triangle variables	
	double degrees = 30; // Angle B
	double oppositelength; // Rib AC
	double hypotenuse = 50; // Rib AB
	double result;

//  Power variables
	double basePower = 20;
	double expPower = 13;
	double powerResult;

	
// Print variables
	String line1;
	String line2;
	String line3;
	String resultStr;
	

	

//====================================================================		
//			Calculate circle area
//====================================================================	
		radiusResult = (int)(radius * radius * Math.PI);
		
		line1 = new String("calculation 1: Area of circle with radius  "+ radius + " = " + radiusResult);		

//====================================================================		
//	 Calculate the length of triangle’s ‘opposite’ where angle B is 30
//	 degrees and the ‘hypotenuse’ length is 50 cm.
//====================================================================	
		result =  (float) (Math.sin(Math.toRadians(degrees)));
		oppositelength = result * hypotenuse;
		
		line2 = new String("calculation 2: Length of opposite where angle B is  " + degrees + " =  " + oppositelength);
	

//====================================================================	
//				Power of 20 with exp of 13
//====================================================================	
		powerResult = Math.pow(basePower, expPower);
		line3 = new String("calculation 3: Power of "+ basePower + " with exp of " + expPower + " = " + powerResult);
	
		
	
	resultStr = line1 + "<br>" + line2 + "<br>" + line3;
	resp.setContentType("text/html");
	resp.getWriter().println(resultStr);
			 
			}
}
			
