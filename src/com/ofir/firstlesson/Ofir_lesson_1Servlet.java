package com.ofir.firstlesson;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Ofir_lesson_1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		int num1 = 4;
		int num2 = 3;
		int num3 = 7;
		int num4 = (num1 + num2) * num3;
				 
		
		resp.setContentType("text/plain");
		resp.getWriter().println("Result of (" + num1 + "+" + num2 + ") * " + num3 + " = " + num4);
	}
}
