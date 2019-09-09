package org.servlet;

import java.util.Properties;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = "/hello")
public class MainServlet extends HttpServlet {

    private Properties getProps() {

        Properties props = new Properties();

        try (InputStream io = ClassLoader.getSystemResourceAsStream("resources/config.properties")){

            props.load(io);
		} catch (IOException e) {
			e.printStackTrace();
        }
        
        return props;
    }

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Properties props = getProps();
        
        resp.getWriter().write("<h1>Hello Ant War Packaging("+props.get("name")+")</h1>");
   }
}