package cabWebServices.billing.model.database;

import java.util.HashMap;
import java.util.Map;

import cabWebServices.billing.model.BillModel;

public class BillDatabase {

		private static Map<Long, BillModel> billingInfo = new HashMap<>();
		
		public static Map<Long, BillModel> getBillingInfo(){
			return billingInfo;
		}
}
