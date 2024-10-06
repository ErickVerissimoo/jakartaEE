package jakartaEE.servets;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/archive")
public class arquivoServlet extends GenericServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		arg1.setContentType("application/pdf");
		File arquiv = new File("/home/gil/Documentos/java.pdf");

		arg1.setContentLength((int) arquiv.length());
		ServletOutputStream fluxo = arg1.getOutputStream();
		FileInputStream faile = new FileInputStream(arquiv);
		byte[] buffer = new byte[1024];
		int byteslidos;
		while((byteslidos = faile.read()) != -1) {
			fluxo.write(buffer, 0, byteslidos);
		}
		faile.close();
		fluxo.flush();
	}

}