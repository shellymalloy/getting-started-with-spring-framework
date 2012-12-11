package sample.spring.chapter05.springbankapp;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import sample.spring.chapter05.springbankapp.beanpostprocessor.BeanNamePrinterBeanFactoryPostProcessor;
import sample.spring.chapter05.springbankapp.beanpostprocessor.ExampleBeanPostProcessor;
import sample.spring.chapter05.springbankapp.dao.AccountStatementDao;
import sample.spring.chapter05.springbankapp.dao.AccountStatementDaoImpl;
import sample.spring.chapter05.springbankapp.dao.CustomerRegistrationDao;
import sample.spring.chapter05.springbankapp.dao.CustomerRegistrationDaoImpl;
import sample.spring.chapter05.springbankapp.dao.FixedDepositDao;
import sample.spring.chapter05.springbankapp.dao.FixedDepositDaoImpl;
import sample.spring.chapter05.springbankapp.domain.CustomerRegistrationDetails;
import sample.spring.chapter05.springbankapp.service.AccountStatementService;
import sample.spring.chapter05.springbankapp.service.AccountStatementServiceImpl;
import sample.spring.chapter05.springbankapp.service.CustomerRegistrationService;
import sample.spring.chapter05.springbankapp.service.CustomerRegistrationServiceImpl;
import sample.spring.chapter05.springbankapp.service.FixedDepositService;
import sample.spring.chapter05.springbankapp.service.FixedDepositServiceImpl;

@Configuration
public class SpringBankAppConfiguration {

	@Bean(name = "accountStatementService")
	public AccountStatementService accountStatementService() {
		return new AccountStatementServiceImpl();
	}

	@Bean(name = "accountStatementDao")
	public AccountStatementDao accountStatementDao() {
		return new AccountStatementDaoImpl();
	}

	@Bean(name = "customerRegistrationService")
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public CustomerRegistrationService customerRegistrationService() {
		return new CustomerRegistrationServiceImpl();
	}

	@Bean(name = "customerRegistrationDao")
	public CustomerRegistrationDao customerRegistrationDao() {
		return new CustomerRegistrationDaoImpl();
	}

	@Bean(name = "customerRegistrationDetails")
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public CustomerRegistrationDetails customerRegistrationDetails() {
		return new CustomerRegistrationDetails();
	}

	@Bean(name = "fixedDepositService")
	public FixedDepositService fixedDepositService() {
		return new FixedDepositServiceImpl();
	}

	@Bean(name = "myFixedDepositDao")
	public FixedDepositDao fixedDepositDao() {
		return new FixedDepositDaoImpl();
	}
	
	@Bean
	public ExampleBeanPostProcessor exampleBeanPostProcessor() {
		return new ExampleBeanPostProcessor();
	}
	
	@Bean
	public static BeanNamePrinterBeanFactoryPostProcessor applicationConfigurer() {
		return new BeanNamePrinterBeanFactoryPostProcessor();
	}
}