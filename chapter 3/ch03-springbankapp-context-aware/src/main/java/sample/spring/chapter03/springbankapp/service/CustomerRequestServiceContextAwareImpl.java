package sample.spring.chapter03.springbankapp.service;

import java.beans.ConstructorProperties;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import sample.spring.chapter03.springbankapp.dao.CustomerRequestDao;
import sample.spring.chapter03.springbankapp.domain.CustomerRequestDetails;

public class CustomerRequestServiceContextAwareImpl implements
		CustomerRequestService, ApplicationContextAware {
	private static Logger logger = Logger
			.getLogger(CustomerRequestServiceContextAwareImpl.class);
	private CustomerRequestDao customerRequestDao;
	private ApplicationContext applicationContext;

	@ConstructorProperties({ "customerRequestDao" })
	public CustomerRequestServiceContextAwareImpl(
			CustomerRequestDao customerRequestDao) {
		logger.info("Created CustomerRequestServiceContextAwareImpl instance");
		this.customerRequestDao = customerRequestDao;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Override
	public void submitRequest(String requestType, String requestDescription) {
		// -- populate CustomerRequestDetails object and save it
		CustomerRequestDetails customerRequestDetails = applicationContext
				.getBean(CustomerRequestDetails.class);
		customerRequestDetails.setType(requestType);
		customerRequestDetails.setDescription(requestDescription);
		customerRequestDao.submitRequest(customerRequestDetails);
	}

}
