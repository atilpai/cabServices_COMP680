package cabWebServices.billing.model.services;

import java.util.ArrayList;
import java.util.Map;

import cabWebServices.billing.model.BillModel;
import cabWebServices.billing.model.database.BillDatabase;


public class BillServices {

		private Map<Long, BillModel> billingInfo = BillDatabase.getBillingInfo();
		
		
		public BillServices(){
			billingInfo.put(1L, new BillModel(1L,1L, 10));
			billingInfo.put(2L, new BillModel(2L, 2L, 20));
			billingInfo.put(3L, new BillModel(3L, 3L, 30));
		}
		
		public Integer addAndSubmitBill(long tripId){
			
			BillModel newBill =  new BillModel(billingInfo.size()+1L,tripId, 48);
			billingInfo.put(billingInfo.size()+1L, newBill);
			return newBill.getAmount();
		}
}
