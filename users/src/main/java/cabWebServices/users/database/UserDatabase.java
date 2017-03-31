package cabWebServices.users.database;

import java.util.HashMap;
import java.util.Map;

import cabWebServices.users.model.UserModel;

public class UserDatabase {
	private static Map<Long, UserModel> userDB = new HashMap<>();

	public static Map<Long, UserModel> getUserDB() {
		return userDB;
	}

}
