package org.javaprep.corealogithms.sorting;

import static org.junit.Assert.assertEquals;

import org.javaprep.common.Constants;
import org.junit.Test;

public class testOutsidePackage {
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
