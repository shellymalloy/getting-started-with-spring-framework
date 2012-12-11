package sample.spring.chapter03.springbankapp.dao;

import org.apache.log4j.Logger;

import sample.spring.chapter03.springbankapp.domain.CustomerRequestDetails;

public class CustomerRequestDaoImpl implements CustomerRequestDao {
	private static Logger logger = Logger.getLogger(CustomerRequestDaoImpl.class);
	
	public CustomerRequestDaoImpl() {
		logger.info("Created CustomerRequestDaoImpl instance");
	}
	
	@Override
	public void submitRequest(CustomerRequestDetails userRequestDetails) {
		// --save UserRequestDetails
	}

}
