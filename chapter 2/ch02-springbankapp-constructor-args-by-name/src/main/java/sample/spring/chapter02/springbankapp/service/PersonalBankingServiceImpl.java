package sample.spring.chapter02.springbankapp.service;

import java.beans.ConstructorProperties;

import sample.spring.chapter02.springbankapp.base.EmailMessageSender;
import sample.spring.chapter02.springbankapp.base.JmsMessageSender;
import sample.spring.chapter02.springbankapp.base.ServiceTemplate;
import sample.spring.chapter02.springbankapp.base.WebServiceInvoker;
import sample.spring.chapter02.springbankapp.dao.PersonalBakingDao;
import sample.spring.chapter02.springbankapp.domain.BankStatement;

public class PersonalBankingServiceImpl extends ServiceTemplate implements
		PersonalBankingService {

	private PersonalBakingDao personalBakingDao;

	@ConstructorProperties({"jmsMessageSender","emailMessageSender","webServiceInvoker"})
	public PersonalBankingServiceImpl(JmsMessageSender jmsMessageSender,
			EmailMessageSender emailMessageSender,
			WebServiceInvoker webServiceInvoker) {
		super(jmsMessageSender, emailMessageSender, webServiceInvoker);
	}

	public void setPersonalBankingDao(PersonalBakingDao personalBakingDao) {
		this.personalBakingDao = personalBakingDao;
	}

	@Override
	public BankStatement getMiniStatement() {
		return personalBakingDao.getMiniStatement();
	}
}
