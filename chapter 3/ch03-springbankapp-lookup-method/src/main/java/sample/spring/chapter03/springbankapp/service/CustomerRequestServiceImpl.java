package sample.spring.chapter03.springbankapp.service;

import java.beans.ConstructorProperties;

import org.apache.log4j.Logger;

import sample.spring.chapter03.springbankapp.dao.CustomerRequestDao;
import sample.spring.chapter03.springbankapp.domain.CustomerRequestDetails;

public abstract class CustomerRequestServiceImpl implements
		CustomerRequestService {
	private static Logger logger = Logger
			.getLogger(CustomerRequestServiceImpl.class);
	private CustomerRequestDao customerRequestDao;

	@ConstructorProperties({ "customerRequestDao" })
	public CustomerRequestServiceImpl(CustomerRequestDao customerRequestDao) {
		logger.info("Created CustomerRequestServiceImpl instance");
		this.customerRequestDao = customerRequestDao;
	}

	public abstract CustomerRequestDetails getCustomerRequestDetails();

	@Override
	public void submitRequest(String requestType, String requestDescription) {
		// -- populate CustomerRequestDetails object and save it
		CustomerRequestDetails customerRequestDetails = getCustomerRequestDetails();
		customerRequestDetails.setType(requestType);
		customerRequestDetails.setDescription(requestDescription);
		customerRequestDao.submitRequest(customerRequestDetails);
	}
}
