package sample.spring.chapter05.springbankapp.dao;

import javax.inject.Named;

import org.apache.log4j.Logger;

import sample.spring.chapter05.springbankapp.domain.CustomerRegistrationDetails;

@Named(value="customerRegistrationDao")
public class CustomerRegistrationDaoImpl implements CustomerRegistrationDao {
	private static Logger logger = Logger
			.getLogger(CustomerRegistrationDaoImpl.class);

	public CustomerRegistrationDaoImpl() {
		logger.info("Created CustomerRegistrationDaoImpl instance");
	}

	@Override
	public void registerCustomer(
			CustomerRegistrationDetails customerRegistrationDetails) {
	}

}
