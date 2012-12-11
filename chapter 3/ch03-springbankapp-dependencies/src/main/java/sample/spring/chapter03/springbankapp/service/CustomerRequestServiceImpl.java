package sample.spring.chapter03.springbankapp.service;

import java.beans.ConstructorProperties;

import org.apache.log4j.Logger;

import sample.spring.chapter03.springbankapp.dao.CustomerRequestDao;
import sample.spring.chapter03.springbankapp.domain.CustomerRequestDetails;

@SuppressWarnings("unused")
public class CustomerRequestServiceImpl implements CustomerRequestService {
	private static Logger logger = Logger
			.getLogger(CustomerRequestServiceImpl.class);
	private CustomerRequestDetails customerRequestDetails;
	private CustomerRequestDao customerRequestDao;

	@ConstructorProperties({ "customerRequestDetails", "customerRequestDao" })
	public CustomerRequestServiceImpl(
			CustomerRequestDetails customerRequestDetails,
			CustomerRequestDao customerRequestDao) {
		logger.info("Created CustomerRequestServiceImpl instance");
		this.customerRequestDetails = customerRequestDetails;
		this.customerRequestDao = customerRequestDao;
	}

	@Override
	public void submitRequest(String requestType, String requestDescription) {
		// -- create an instance of UserRequestDetails and save it
	}

}
