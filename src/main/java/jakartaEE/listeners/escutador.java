package jakartaEE.listeners;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class escutador implements ServletContextListener{
@Override
public void contextInitialized(ServletContextEvent sce) {
	System.out.println("A aplicação iniciou - do listener");
}
@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Aplicação encerrada");
	}
}
