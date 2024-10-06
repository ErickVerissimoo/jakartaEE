package jakartaEE.CDI.EJB;

import java.io.IOException;

import jakarta.ejb.EJB;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/Enterprise")
public class OláEnterprise extends GenericServlet {
	@EJB
	private ClientLocal cliente;
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		String nome = cliente.ola("erick");
		System.out.println(nome);

	}

}
