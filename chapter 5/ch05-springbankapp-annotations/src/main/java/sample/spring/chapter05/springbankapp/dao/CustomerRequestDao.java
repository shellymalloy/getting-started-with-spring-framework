package sample.spring.chapter05.springbankapp.dao;

import sample.spring.chapter05.springbankapp.domain.CustomerRequestDetails;

public interface CustomerRequestDao {
	void submitRequest(CustomerRequestDetails userRequestDetails);
}
