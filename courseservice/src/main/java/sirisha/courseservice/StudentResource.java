package sirisha.courseservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/students")
public class StudentResource {
	@GET
	/*Defined the type of response that goes back to client */
	@Produces(MediaType.TEXT_PLAIN)
	public String getStudent(){
		return "Hello world";
	}

}
