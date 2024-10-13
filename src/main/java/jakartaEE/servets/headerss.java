package jakartaEE.servets;

import java.io.IOException;

import org.apache.openejb.server.httpd.HttpResponse;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/headers")
public class headerss extends GenericServlet{

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		HttpServletRequest req = (HttpServletRequest) arg0;
		HttpServletResponse resp = (HttpServletResponse) arg1;
		resp.setHeader("Content-Type", "text/html; charset=UTF-8");
		resp.getWriter().write("<strong>Ola mundo de novo</strong>");
		
	}

}
