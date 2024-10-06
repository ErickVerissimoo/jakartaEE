package jakartaEE.CDI.EJB;

import jakarta.ejb.Local;

@Local
public interface ClientLocal {
	String ola (String nome);
}
