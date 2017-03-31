package cabWebServices.tripManager.model;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class TripManagerModel {
	
		String driverName;
		Long userId;
		Long tripId;
		
		public TripManagerModel(){
			
		}
		
		public TripManagerModel(String drivName, Long user, long tId){
			driverName=drivName;
			userId=user;
			tripId=tId;
		}
		
		
		
		public String getDriver() {
			return driverName;
		}
		public void setUser(String driver) {
			driverName = driver;
		}
		public Long getUser() {
			return userId;
		}
		public void setUser(long user) {
			this.userId = user;
		}
		public Long getTripId() {
			return tripId;
		}
		public void setTripId(Long tripId) {
			this.tripId = tripId;
		}

}
