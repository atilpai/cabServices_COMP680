package cabWebServices.users.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserDriverModel {

	private String driverName;
	private String availability;
	
	public UserDriverModel(String name,  String avail){
		driverName=name;
		availability=avail;
	}
	
	public UserDriverModel(){
		
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
