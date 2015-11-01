package org.javaprep.oop;

public class ContractingCompany implements Payee {

	private String name;
	private Integer bankAccount;
	private Double currentBalance;
	
	public ContractingCompany(String name, Integer bankAccount){
		this.name = name;
		this.bankAccount = bankAccount;
		currentBalance = 0.0;
	} 
	
	@Override
	public String name() {
		return name;
	}

	@Override
	public Double grossPayment() {	
		return doPayment();
	} 	
	private Double doPayment(){
		Double balance = currentBalance;
		currentBalance = 0.0;
		return balance;
	}

	@Override
	public Integer bankAccount() { 
		return bankAccount;
	}

	public void payForServices(Double amount){
		currentBalance += amount;
	}
	
}
