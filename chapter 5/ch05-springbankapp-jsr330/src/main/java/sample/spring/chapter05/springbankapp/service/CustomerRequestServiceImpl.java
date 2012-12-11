package sample.spring.chapter05.springbankapp.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;

import sample.spring.chapter05.springbankapp.dao.CustomerRequestDao;
import sample.spring.chapter05.springbankapp.domain.CustomerRequestDetails;

@Named(value = "customerRequestService")
public class CustomerRequestServiceImpl implements CustomerRequestService {
	private static Logger logger = Logger
			.getLogger(CustomerRequestServiceImpl.class);
	private CustomerRequestDetails customerRequestDetails;
	private CustomerRequestDao customerRequestDao;

	@Inject
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
		customerRequestDao.submitRequest(customerRequestDetails);
	}

}
