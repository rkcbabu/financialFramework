package project.ccard;

import java.util.ArrayList;
import java.util.List;
import project.bank.AccountType;
import project.framework.FormModel;
import project.framework.ICellData;
import project.framework.account.IAccount;
import project.framework.customer.Address;
import project.framework.customer.Customer;
import project.framework.customer.ICustomer;
import project.framework.customer.ICustomerManager;
import project.framework.customer.Person;
import project.framework.factory.AbstractFactory;
import project.framework.reporting.IReportComputer;
import project.framework.transaction.Transaction;

public class CCardFactory extends AbstractFactory {

    @Override
    public IReportComputer getReportComputer() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ICellData> getDataSet(ICustomerManager customerManager) {
        List<ICellData> list = new ArrayList<ICellData>();
        for (ICustomer c : customerManager.getAll()) {
            for (IAccount a : c.getAll()) {
                list.add(new CCardDataSet(c, a));
            }
        }
        return list;
    }

    @Override
    public ICustomer createCustomer(FormModel form, String customerType) {
        String name = form.getName();
        String email = form.getEmail();
        String street = form.getStreet();
        String city = form.getCity();
        String state = form.getState();
        String zipCode = form.getZip();
        Address address = new Address(street, city, zipCode, state);
        return new Person(address, name, email, "");
    }

    @Override
    public IAccount createAccount(FormModel form, ICustomer customer,
            String accountType) {
		// process the form for any field required to create the account,
        // in this case the application itself generates the account number
        AccountType type;
        if (form instanceof CCardFormModel) {
            CCardFormModel model = (CCardFormModel) form;
            int ccNumber = model.getCcNumber();
            CCAccountType accType = model.getCcAccountType();
            String expirydate = model.getExpDate();
            if (accType == CCAccountType.bronze) {
                return new BronzeCCardAccount(ccNumber, customer, expirydate);
            } else if (accType == CCAccountType.silver) {
                return new SilverCCardAccount(ccNumber, customer, expirydate);
            } else if (accType == CCAccountType.gold) {
                return new GoldCCardAccount(ccNumber, customer, expirydate);
            }
        }
        return null;
    }

    @Override
    public Transaction getTransaction(IAccount account, double amount,
            String type) {
        if (type.equals("deposit")) {
            return new CCardDeposit(account, amount, "");
        } else {
            return new CCardCharge(account, amount, "");
        }
    }

}
