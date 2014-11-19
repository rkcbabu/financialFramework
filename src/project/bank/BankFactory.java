package project.bank;

import java.util.ArrayList;
import java.util.List;
import project.framework.FormModel;
import project.framework.ICellData;
import project.framework.account.IAccount;
import project.framework.customer.ACustomer;
import project.framework.customer.Address;
import project.framework.customer.Customer;
import project.framework.customer.ICustomer;
import project.framework.customer.ICustomerManager;
import project.framework.customer.Organisation;
import project.framework.customer.Person;
import project.framework.factory.AbstractFactory;
import project.framework.reporting.IReportComputer;
import project.framework.transaction.Transaction;


public class BankFactory extends AbstractFactory{

	@Override
	public IReportComputer getReportComputer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ICellData> getDataSet(ICustomerManager customerManager) {
		List<ICellData> list = new ArrayList<ICellData>();
		for(ICustomer c:customerManager.getAll()){
			for(IAccount a:c.getAll()){
				list.add(new BankDataSet(c, a));
			}
		}
		return list;
	}

	@Override
	public ACustomer createCustomer(FormModel form, String customerType) {
		String name = form.getName();
		String email = form.getEmail();
		String street = form.getStreet();
		String city = form.getCity();
		String state = form.getState();
		String zipCode= form.getZip();
		Address address =new Address(street, city, zipCode, state);
		if(form instanceof PersonalModel){
			PersonalModel personalModel = (PersonalModel)form;
			String dateOfBirth = personalModel.getBirthDate();
			return new Person(address, name, email,dateOfBirth);
		}
		else{
			CompanyModel companyModel = (CompanyModel) form;
			int numEmployee = companyModel.getNumberOfEmployees();
			return new Organisation(address, name, email, numEmployee);
		}
	}

	@Override
	public IAccount createAccount(FormModel form, ICustomer customer,
			String accountType) {
		//process the form for any field required to create the account, 
		//in this case the application itself generates the account number
		AccountType type;
		if(form instanceof PersonalModel){
			PersonalModel model=(PersonalModel) form;
			type=model.getAccountType();
		}else{
			CompanyModel model=(CompanyModel) form;
			type=model.getAccountType();
			
		}
		if(type.equals(AccountType.checkings)){
		return new CheckingAccount(customer,1.16);
		}else{
		return new SavingAccount(customer,1.16);
		}		
	}

	@Override
	public Transaction getTransaction(IAccount account, double amount,
			String type) {
		if(type.equals("deposit")){
			return new BankDeposit(account, amount, "");
		}
		else if(type.equals("addinterest")){
			return new AddInterest(account, amount, "");
		}
		else{
			return new BankWithdrawal(account, amount, "");
		}
	}

	

}
