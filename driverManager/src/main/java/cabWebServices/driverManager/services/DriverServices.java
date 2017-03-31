package cabWebServices.driverManager.services;

import java.util.ArrayList;
import java.util.Map;

import cabWebServices.driverManager.database.DriverDatabase;
import cabWebServices.driverManager.model.DriverModel;
public class DriverServices {

		private Map<String, DriverModel> driverDB= DriverDatabase.getDriverInfo();
		
		
		public DriverServices (){
			driverDB.put("mukesh", new DriverModel("mukesh", "available"));
			driverDB.put("somu", new DriverModel("somu", "busy"));
			driverDB.put("shahi", new DriverModel("shahi", "busy"));
		}
		
		
		public DriverModel checkDriverAvailability(String driverName){
			DriverModel newDriver= driverDB.get(driverName);
			return newDriver;
		}
		
		public ArrayList<DriverModel> getDriverList(){
			return new ArrayList<DriverModel> (driverDB.values());
		}

}
