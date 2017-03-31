package cabWebServices.tripManager.database;

import java.util.HashMap;
import java.util.Map;

import cabWebServices.tripManager.model.TripDriverModel;
//import cabWebServices.driverManager.model.DriverModel;
import cabWebServices.tripManager.model.TripManagerModel;

public class TripManagerDatabase {
	
	private static Map<Long, TripManagerModel> theTrip= new HashMap<>();
	private static Map<String, TripDriverModel> driverLocate = new HashMap<>();
	
	public static Map<Long, TripManagerModel> getTheTrip(){
		return theTrip;
	}
	
	public static Map<String, TripDriverModel> getDriverLocate(){
		return driverLocate;
	}
	

}
