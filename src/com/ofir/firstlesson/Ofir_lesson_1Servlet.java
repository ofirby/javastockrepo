package com.ofir.firstlesson;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Ofir_lesson_1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
