package org.javaprep.oop;

public class SalaryEmployee extends Employee{
	
 	public SalaryEmployee(String name, Integer bankAccount, Double grossWage, Double allowance){
		super(name,bankAccount,grossWage, allowance);
	}

	public Double grossPayment() {		 
		return grossWage + doCurrentBonus();
	}

	@Override
	public void giveBonus(Double percentage) {
		currentBonus += grossWage * (percentage/100.0); 
	}
 	
}
