package jakartaEE.servets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
/*
 * Implementação de 'baixo nível' de um servlet, usando a API raiz
 */
public final class servletRustico implements Servlet {
	ServletConfig config = null;
	private static int instancias = 0;

	public servletRustico() {
		instancias++;
	}

	@Override
	public void destroy() {
		this.config = null;

	}

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public String getServletInfo() {

		try {
			return config.getServletContext().getServletContextName();
		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		this.config = arg0;

	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		PrintWriter out = arg1.getWriter();
		out.println("Nome: " + config.getServletName());
		out.println("Informacoes: "+ config.getServletContext().getServerInfo());
		out.println(config.getServletContext().getVirtualServerName());
		out.println("Contexto:" + config.getServletContext().getContextPath());
		out.println("Insciancia:" + instancias);
		ServletInputStream fluxo = arg0.getInputStream();

		ServletOutputStream saida = arg1.getOutputStream();
		saida.println("saida via out put");
		saida.write("calma delicio".getBytes());
		out.println(this.getServletInfo());

		fluxo.close();
		saida.close();
		out.close();
	}

}
