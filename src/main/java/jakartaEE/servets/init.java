package jakartaEE.servets;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/init"}, initParams = {@WebInitParam(name = "numero1", value = "2", description = "inicializador de parametros")
,@WebInitParam(name = "numero2", value = "2", description = "inicializador de parametros")



} )
public class init extends GenericServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		arg1.getWriter().print(Integer.parseInt( getInitParameter("numero1")) + Integer.parseInt(getInitParameter("numero2")));
		
	}

}
