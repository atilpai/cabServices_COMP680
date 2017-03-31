package cabWebServices.billing.model.resources;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cabWebServices.billing.model.BillModel;
import cabWebServices.billing.model.services.BillServices;



@Path("/billing")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class BillResource {


		BillServices billServiceProvider = new BillServices();
		
		
		@Path("/{tripId}")
		@GET
		public String getBill(@PathParam("tripId") Long tripId){
			
			int finalAmount= billServiceProvider.addAndSubmitBill(tripId);
			return "You have been charged  $"+finalAmount+ " !!" ;
		}
		
}
