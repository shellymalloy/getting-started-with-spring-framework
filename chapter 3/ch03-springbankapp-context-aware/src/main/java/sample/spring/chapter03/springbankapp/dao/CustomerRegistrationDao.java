package sample.spring.chapter03.springbankapp.dao;

import sample.spring.chapter03.springbankapp.domain.CustomerRegistrationDetails;

public interface CustomerRegistrationDao {
	void registerCustomer(
			CustomerRegistrationDetails customerRegistrationDetails);
}
