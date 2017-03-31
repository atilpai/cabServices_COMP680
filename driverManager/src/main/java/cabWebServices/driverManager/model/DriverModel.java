package cabWebServices.driverManager.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DriverModel {

		private String driverName;
		private String availability;
		
		public DriverModel(String name,  String avail){
			driverName=name;
			availability=avail;
		}
		
		public DriverModel(){
			
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
