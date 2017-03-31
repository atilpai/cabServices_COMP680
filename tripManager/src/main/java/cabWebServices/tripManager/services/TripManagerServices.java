package cabWebServices.tripManager.services;

import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import cabWebServices.tripManager.database.TripManagerDatabase;
import cabWebServices.tripManager.model.TripDriverModel;
import cabWebServices.tripManager.model.TripManagerModel;
public class TripManagerServices {

	private static Map<Long, TripManagerModel> theTrip= TripManagerDatabase.getTheTrip();
	private static Map<String, TripDriverModel> driverLocate = TripManagerDatabase.getDriverLocate();
	
	public TripManagerServices (){
		driverLocate.put("bombay", new TripDriverModel("mukesh", "available"));
		driverLocate.put("chandigarh", new TripDriverModel("somu", "available"));
		driverLocate.put("goa", new TripDriverModel("shahi", "available"));
	}
	
	public String checkDriver(String location){
		TripDriverModel searchDriver=driverLocate.get(location);
		Client client = ClientBuilder.newClient();
		String response= client.target("http://localhost:8082/driverManager/webapi/driverManager/"+searchDriver.getDriverName()).request(MediaType.APPLICATION_XML).get(new GenericType<String>(){});
		searchDriver.setAvailability(response);	
		return response;
	}
	
	public Long saveDetailsAboutNewTrip(Long userId, String driverName){
		TripManagerModel newTrip = new TripManagerModel(driverName, userId, theTrip.size()+1L);
		theTrip.put(theTrip.size()+1L,newTrip );
		return newTrip.getTripId();
	}
	
	public String startTrip(long tripId) {
		Client client = ClientBuilder.newClient();
		String response= client.target("http://localhost:8083/billing/webapi/billing/"+tripId).request(MediaType.APPLICATION_XML).get(new GenericType<String>(){});
			return response;
	}	
}
