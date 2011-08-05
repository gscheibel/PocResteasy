package resteasy.front;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import resteasy.beans.Persons;

@Path("/data")
public class DataServices {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{customerName}")
	public Persons getData(@PathParam("customerName") String customerName) {
		return new Persons(customerName, 25);
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Persons> getAllPersons() {
		List<Persons> lists = new ArrayList<Persons>();
		lists.add(new Persons("Guillaume", 25));
		lists.add(new Persons("Olivier", 30));
		return lists;
	}
}
