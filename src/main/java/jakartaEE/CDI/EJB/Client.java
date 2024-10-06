package jakartaEE.CDI.EJB;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateful;

/**
 * Session Bean implementation class Client
 */
@Stateful
@LocalBean
public class Client implements ClientLocal {

    /**
     * Default constructor. 
     */
    public Client() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String ola(String nome) {
		// TODO Auto-generated method stub
		return "Ola" + nome;
	}

}
