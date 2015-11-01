package org.javaprep.oop;

public class PaymentApplication {

	public static void main(String[] args) {
		PaymentSystem paymentSystem = new PaymentSystem();
		
		CommissionEmployee johnDoe = new CommissionEmployee("John Smith", 1111,300.0, 100.0);
		paymentSystem.addPayee(johnDoe);
		
		CommissionEmployee paulJones = new CommissionEmployee("Paul Jones", 2222,350.0, 125.0);
		paymentSystem.addPayee(paulJones);
	
		SalaryEmployee mollyBrown = new SalaryEmployee("Molly Brown",3333,500.0,110.0);
		paymentSystem.addPayee(mollyBrown);
		
		SalaryEmployee susanWhite = new SalaryEmployee("Susan White", 4444,470.0,130.0);
		paymentSystem.addPayee(susanWhite);
		
		ContractingCompany javaCodeGeeks = new ContractingCompany("javacodegeeks.com", 6666);
		paymentSystem.addPayee(javaCodeGeeks);
		
		ContractingCompany acmeInc = new ContractingCompany("Acme Inc", 5555);
		paymentSystem.addPayee(acmeInc);
		
		
		//add commission
		johnDoe.giveCommission(40.0);
		johnDoe.giveCommission(35.0);
		johnDoe.giveCommission(45.0);
		johnDoe.giveBonus(5.0);
		
		paulJones.giveCommission(45.0);
		paulJones.giveCommission(51.0);
		paulJones.giveCommission(23.0);
		paulJones.giveCommission(14.5);
		paulJones.giveCommission(57.3);
		paulJones.giveBonus(6.5);
		
		mollyBrown.giveBonus(3.0);
		susanWhite.giveBonus(7.5);
		
		javaCodeGeeks.payForServices(400.0);
		javaCodeGeeks.payForServices(250.0);
		
		acmeInc.payForServices(100.0);
		acmeInc.payForServices(250.0);
		acmeInc.payForServices(300.0);
		
		paymentSystem.processPayments();
		

	}

}
