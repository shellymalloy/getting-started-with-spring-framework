package sample.spring.chapter03.springbankapp.dao;

import sample.spring.chapter03.springbankapp.domain.CustomerRequestDetails;

public interface CustomerRequestDao {
	void submitRequest(CustomerRequestDetails userRequestDetails);
}
