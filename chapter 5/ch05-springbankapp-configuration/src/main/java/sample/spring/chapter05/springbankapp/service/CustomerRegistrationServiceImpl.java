package sample.spring.chapter05.springbankapp.service;

import org.springframework.beans.factory.annotation.Autowired;

import sample.spring.chapter05.springbankapp.dao.CustomerRegistrationDao;
import sample.spring.chapter05.springbankapp.domain.CustomerRegistrationDetails;

public class CustomerRegistrationServiceImpl implements
		CustomerRegistrationService {

	private CustomerRegistrationDetails customerRegistrationDetails;

	@Autowired
	private CustomerRegistrationDao customerRegistrationDao;

	@Autowired
	public void obtainCustomerRegistrationDetails(
			CustomerRegistrationDetails customerRegistrationDetails) {
		this.customerRegistrationDetails = customerRegistrationDetails;
	}

	public CustomerRegistrationDetails getCustomerRegistrationDetails() {
		return customerRegistrationDetails;
	}

	public CustomerRegistrationDao getCustomerRegistrationDao() {
		return customerRegistrationDao;
	}

	@Override
	public void setAccountNumber(String accountNumber) {
		customerRegistrationDetails.setAccountNumber(accountNumber);
	}

	@Override
	public void setAddress(String address) {
		customerRegistrationDetails.setAddress(address);
	}

	@Override
	public void setDebitCardNumber(String cardNumber) {
		customerRegistrationDetails.setCardNumber(cardNumber);
	}

	@Override
	public void register() {
		customerRegistrationDao.registerCustomer(customerRegistrationDetails);
	}
}
