package sample.spring.chapter02.springbankapp;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.spring.chapter02.springbankapp.controller.FixedDepositController;
import sample.spring.chapter02.springbankapp.controller.PersonalBankingController;
import sample.spring.chapter02.springbankapp.controller.UserRequestController;
import sample.spring.chapter02.springbankapp.domain.FixedDepositDetails;
import sample.spring.chapter02.springbankapp.domain.Request;

public class SpringBankApp {
	private static Logger logger = Logger.getLogger(SpringBankApp.class);

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring/applicationContext.xml");

		FixedDepositController fixedDepositController = context
				.getBean(FixedDepositController.class);
		fixedDepositController.submit(context
				.getBean(FixedDepositDetails.class).setDepositAmount(100)
				.setEmail("someemail@somedomain.com").setId(1).setTenure(10));
		logger.info("Your fixed deposit details : "
				+ fixedDepositController.get());

		PersonalBankingController personalBankingController = context
				.getBean(PersonalBankingController.class);
		logger.info(personalBankingController.getMiniStatement());

		UserRequestController userRequestController = context
				.getBean(UserRequestController.class);
		userRequestController.submitRequest(new Request());
		logger.info("Submitted user request");
	}
}
