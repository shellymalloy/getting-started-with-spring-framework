package sample.spring.chapter04.springbankapp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.spring.chapter04.springbankapp.domain.FixedDepositDetails;
import sample.spring.chapter04.springbankapp.service.FixedDepositService;

public class SpringBankApp {
	public static void main(String args[]) throws Exception {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring/applicationContext.xml");
		context.registerShutdownHook();
		FixedDepositService fixedDepositService = context
				.getBean(FixedDepositService.class);
		fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 1000,
				12, "someemail@somedomain.com"));
		context.getBean("eventSenderFactory");
		context.getBean("eventSenderFactory");
	}
}
