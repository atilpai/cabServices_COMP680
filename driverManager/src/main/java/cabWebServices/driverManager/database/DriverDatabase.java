package cabWebServices.driverManager.database;

import java.util.HashMap;
import java.util.Map;

import cabWebServices.driverManager.model.DriverModel;
public class DriverDatabase {

		private static Map<String, DriverModel> driverInfo= new HashMap<>();
		
		public static Map<String, DriverModel>getDriverInfo(){
			return driverInfo;
		}
}
