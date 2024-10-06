package jakartaEE.CDI;

import java.io.IOException;

import jakarta.inject.Inject;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/Injetar")
public class Injecao extends GenericServlet {

	private static final long serialVersionUID = 1L;
	@Inject
	private pessoa Person;
	@Inject
	private gato gatil;
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		if(Person !=null && gatil != null) {
			Person.setIdade(20);
			arg1.getWriter().print(Person == null && gatil == null);


		}





	}

}
