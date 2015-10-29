package org.javaprep.common;

import static org.junit.Assert.*;

import org.junit.Test;

public class testResponseStatus {
		@Test
		public void getResponseStatus(){
			assertEquals("ERROR",Constants.Status.ERROR.getValue());
			assertEquals("SUCCESS",Constants.Status.SUCCESS.getValue());
		}
		
		@Test
		public void getPaymentPlanStatus(){
			assertEquals("ACPT",Constants.PaymentPlanStatus.ACCEPTED.getValue());
			assertEquals("ACTV",Constants.PaymentPlanStatus.ACTIVE.getValue());
		}		
}

