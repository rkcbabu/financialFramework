package project.bank;

import project.framework.FormModel;


public class CompanyModel extends FormModel {

	private int numberOfEmployees;
	private AccountType accountType;

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

}
