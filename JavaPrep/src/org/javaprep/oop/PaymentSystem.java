package org.javaprep.oop;

import java.util.ArrayList;
import java.util.List;

public class PaymentSystem {
	private List<Payee> payees;
	private Double taxRate = 0.2;
	
	public PaymentSystem(){
		payees = new ArrayList<>();
	}
	
	public void addPayee(Payee payee){
		if(!payees.contains(payee)){
			payees.add(payee);
		}
	}
	
	public void processPayments(){
		for(Payee payee:payees){
			Double grossPayment = payee.grossPayment();
			Double tax = 0.0;
			
			if(payee instanceof TaxablePayee){
				Double taxableIncome = grossPayment - ((TaxablePayee) payee).allowance();
				tax = taxableIncome * taxRate; 
			}
			
			Double netPayment = grossPayment - tax;
			
			System.out.println("Paying to " + payee.name());
			System.out.println("Gross " + grossPayment);
			System.out.println("Tax -" + tax);
			System.out.println("NetPayment " + netPayment);
			System.out.println("Transferred to Account: " + payee.bankAccount());
		}
		
		
		
	}
}
