package sample.spring.chapter05.springbankapp;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.spring.chapter05.springbankapp.domain.FixedDepositDetails;
import sample.spring.chapter05.springbankapp.service.FixedDepositService;

public class SpringBankApp {
	private static Logger logger = Logger.getLogger(SpringBankApp.class);

	public static void main(String args[]) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring/applicationContext.xml");
		logger.info("Validating FixedDepositDetails object using Spring Validation API");

		FixedDepositService fixedDepositService = (FixedDepositService) context
				.getBean("fixedDepositService");
		fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 0,
				12, "someemail@somedomain.com"));
		fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 1000,
				12, "someemail@somedomain.com"));

		logger.info("Validating FixedDepositDetails object using JSR 303's Validator");
		FixedDepositService fixedDepositServiceJsr303 = (FixedDepositService) context
				.getBean("fixedDepositServiceJsr303");
		fixedDepositServiceJsr303.createFixedDeposit(new FixedDepositDetails(1,
				0, 12, "someemail@somedomain.com"));
		fixedDepositServiceJsr303.createFixedDeposit(new FixedDepositDetails(1,
				1000, 12, "someemail@somedomain.com"));
	}
}
