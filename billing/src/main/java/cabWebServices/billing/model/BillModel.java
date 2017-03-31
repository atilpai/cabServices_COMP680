package cabWebServices.billing.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BillModel {

		private long billId;
		private  long tripId;
		private int amount;
		
		
		public BillModel(){
			
		}
		
		public BillModel(long bId,  long tId, int am) {
			
			billId = bId;
			tripId = tId;
			amount=am;
		}
		
		
		
		public Integer getAmount() {
			return amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}

		public long getBillId() {
			return billId;
		}
		public void setBillId(long billId) {
			this.billId = billId;
		}
		public long getTripId() {
			return tripId;
		}
		public void setTripId(long tripId) {
			this.tripId = tripId;
		}
}
