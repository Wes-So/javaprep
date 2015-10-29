package org.javaprep.common;

public class Constants {
	public enum Status{
		SUCCESS("SUCCESS"),ERROR("ERROR");
		private String value;
		
		public String getValue() {
			return value;
		}

		private  Status(String code) {
			value = code;
		} 
	}

	public enum PaymentPlanStatus{
		ACTIVE("ACTV"),ACCEPTED("ACPT");
		private String value;
		
		public String getValue() {
			return value;
		}

		private  PaymentPlanStatus(String code) {
			value = code;
		} 
	}	
}
