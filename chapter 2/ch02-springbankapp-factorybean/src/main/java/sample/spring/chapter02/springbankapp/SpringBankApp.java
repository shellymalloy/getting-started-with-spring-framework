package sample.spring.chapter02.springbankapp;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.spring.chapter02.springbankapp.domain.FixedDepositDetails;
import sample.spring.chapter02.springbankapp.service.FixedDepositService;

public class SpringBankApp {
	private static Logger logger = Logger.getLogger(SpringBankApp.class);
	
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring/applicationContext.xml");

		FixedDepositService fixedDepositService = (FixedDepositService) context
				.getBean("service");

		fixedDepositService.createFixedDeposit(new FixedDepositDetails(101,
				10000, 60, "someemail@somedomain.com"));
		
		logger.info("Invoking getBean(\"eventFactory\") returns : " + context.getBean("eventSenderFactory"));
		logger.info("Invoking getBean(\"&eventFactory\") returns : " + context.getBean("&eventSenderFactory"));
	}
}
