package sample.spring.chapter05.springbankapp.dao;

import sample.spring.chapter05.springbankapp.domain.CustomerRegistrationDetails;

public interface CustomerRegistrationDao {
	void registerCustomer(
			CustomerRegistrationDetails customerRegistrationDetails);
}
