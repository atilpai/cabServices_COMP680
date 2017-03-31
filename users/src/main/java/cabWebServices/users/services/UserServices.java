package cabWebServices.users.services;

import java.util.ArrayList;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import cabWebServices.users.database.UserDatabase;
import cabWebServices.users.model.UserModel;


public class UserServices {
	UserModel user;
	private Map<Long, UserModel> userDB = UserDatabase.getUserDB();
	
	public UserServices(){
		userDB.put(1L, new UserModel(1L, "atil", "prairie"));
		userDB.put(2L, new UserModel(2L,"kosha", "legacy"));
		userDB.put(3L, new UserModel(3L,"chinmay", "legacy"));
	}
	
	
	public UserModel add(UserModel newUser){
		newUser.setUserId(userDB.size()+1L);
		userDB.put(newUser.getUserId(), newUser);
		return newUser;
	}
	
	public ArrayList<UserModel> showAll(){
		return new ArrayList<UserModel>(userDB.values());
	}
	
	public String talkToTripManager( String location){
		Client client = ClientBuilder.newClient();
		String response= client.target("http://localhost:8081/tripManager/webapi/tripManager/getCab/" +location).request(MediaType.APPLICATION_XML).get(new GenericType<String>(){});	
		return response;
	}

}
