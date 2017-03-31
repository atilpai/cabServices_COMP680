package cabWebServices.users.resources;

import java.util.List;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import cabWebServices.users.model.UserDriverModel;
import cabWebServices.users.model.UserModel;
import cabWebServices.users.services.UserServices;



@Path("/users")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class UserResource {
UserServices serviceProvider= new UserServices();
	

	@Path("/{userName}")
	@POST
	public UserModel registerUser(UserModel newUser){
		return serviceProvider.add(newUser);
	}
	
	@Path("/trying")
	@GET
	public String justTry(){
		return "dude!!";
	}
	
	
	@GET
	public List<UserModel> getAllUsers(){
		
		return serviceProvider.showAll();
	}
	
	@Path("/getCab/{location}") 	
	@GET
	public String getCab(@PathParam("location") String location){
		
		String response= serviceProvider.talkToTripManager(location);
		return response;
	}

	
	//testing
	
	@Path("/test/{name}")
	@GET
	public String doIPC_Test(@PathParam("name") String name){
		Client client = ClientBuilder.newClient();
		String response= client.target("http://localhost:8081/tripManager/webapi/tripManager/testing/" + name).request(MediaType.APPLICATION_XML).get(new GenericType<String>(){});
			return response;
	}
}
