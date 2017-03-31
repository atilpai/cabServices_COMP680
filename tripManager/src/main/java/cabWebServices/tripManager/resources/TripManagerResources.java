package cabWebServices.tripManager.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import cabWebServices.tripManager.services.TripManagerServices;

@Path("/tripManager")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)

public class TripManagerResources {

TripManagerServices tripServiceProvider= new TripManagerServices();
	
	
	@Path("/getCab/{location}")
	@GET
	public String checkDriver(@PathParam("location") String location){
		String response=tripServiceProvider.checkDriver(location);
	
		return response;
	}
	
	
	@Path("/startTrip/{userId}/{driverName}")
	@GET
	public String storeJourneyInfoAndReturnBill(@PathParam("userId") Long userId, @PathParam("driverName") String driverName) {
		Long tripId= tripServiceProvider.saveDetailsAboutNewTrip(userId, driverName);
		String theBill= tripServiceProvider.startTrip(10L/*tripId*/);
		return theBill;
	}
	
	
	@GET
	public String just(){
		return "checking";
	}
	
}
