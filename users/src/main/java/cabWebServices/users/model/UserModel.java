package cabWebServices.users.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserModel {
		
		private String userName;
		private Long userId;
		private String location;
		
		
		public UserModel(){
			
			
		}
		
		
		public UserModel(Long id, String uName, String locat){
			userName=uName;
			location=locat;
			userId=id;
		}
		
		
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
}
