package sample.spring.chapter05.springbankapp.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import sample.spring.chapter05.springbankapp.domain.CustomerRegistrationDetails;

@Repository(value="customerRegistrationDao")
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
