package cabWebServices.tripManager.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TripDriverModel {

	private String driverName;
	private String availability;
	
	public TripDriverModel(String name,  String avail){
		driverName=name;
		availability=avail;
	}
	
	public TripDriverModel(){
		
	}
	
	
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
}
