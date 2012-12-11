package sample.spring.chapter05.springbankapp.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import sample.spring.chapter05.springbankapp.domain.CustomerRequestDetails;

@Repository(value = "customerRequestDao")
public class CustomerRequestDaoImpl implements CustomerRequestDao {
	private static Logger logger = Logger
			.getLogger(CustomerRequestDaoImpl.class);

	public CustomerRequestDaoImpl() {
		logger.info("Created CustomerRequestDaoImpl instance");
	}

	@Override
	public void submitRequest(CustomerRequestDetails userRequestDetails) {
		// --save UserRequestDetails
	}
}
