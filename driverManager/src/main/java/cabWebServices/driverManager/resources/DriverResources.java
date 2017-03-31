package cabWebServices.driverManager.resources;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cabWebServices.driverManager.model.DriverModel;
import cabWebServices.driverManager.services.DriverServices;

@Path("/driverManager")
@Produces(MediaType.APPLICATION_XML)
public class DriverResources {

		DriverServices driverService= new DriverServices();
		
		
		@Path("/{driverName}")
		@GET
		public String driverLookUp(@PathParam("driverName") String driverName){
			DriverModel response=driverService.checkDriverAvailability(driverName);
			if(response.getAvailability().matches("available")){
			return response.getDriverName();
			}
			else{
				return "busy";
			}
		}
		
		@Path("/all")
		@GET
		public ArrayList<DriverModel> getAll(){
			return driverService.getDriverList();
		}
}
