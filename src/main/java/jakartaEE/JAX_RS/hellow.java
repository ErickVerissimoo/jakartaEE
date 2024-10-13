package jakartaEE.JAX_RS;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/jakartinha")
public class hellow {
@GET
@Produces(MediaType.TEXT_PLAIN)
public String sayHello() {
	return "ola mundo";
}
}
