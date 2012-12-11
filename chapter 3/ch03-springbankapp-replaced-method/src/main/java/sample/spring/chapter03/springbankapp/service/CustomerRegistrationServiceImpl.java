package sample.spring.chapter03.springbankapp.service;

import java.beans.ConstructorProperties;

import org.apache.log4j.Logger;

import sample.spring.chapter03.springbankapp.dao.CustomerRegistrationDao;
import sample.spring.chapter03.springbankapp.domain.CustomerRegistrationDetails;

public class CustomerRegistrationServiceImpl implements
		CustomerRegistrationService {
	private static Logger logger = Logger
			.getLogger(CustomerRegistrationServiceImpl.class);

	private CustomerRegistrationDetails customerRegistrationDetails;
	private CustomerRegistrationDao customerRegistrationDao;

	@ConstructorProperties({ "customerRegistrationDetails",
			"customerRegistrationDao" })
	public CustomerRegistrationServiceImpl(
			CustomerRegistrationDetails customerRegistrationDetails,
			CustomerRegistrationDao customerRegistrationDao) {
		this.customerRegistrationDetails = customerRegistrationDetails;
		this.customerRegistrationDao = customerRegistrationDao;
		logger.info("Created CustomerRegistrationServiceImpl instance");
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
