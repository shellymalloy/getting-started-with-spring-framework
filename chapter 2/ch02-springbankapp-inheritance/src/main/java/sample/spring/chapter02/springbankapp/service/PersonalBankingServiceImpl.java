package sample.spring.chapter02.springbankapp.service;

import sample.spring.chapter02.springbankapp.dao.PersonalBakingDao;
import sample.spring.chapter02.springbankapp.domain.BankStatement;

public class PersonalBankingServiceImpl implements PersonalBankingService {

	private PersonalBakingDao personalBakingDao;

	public void setPersonalBankingDao(PersonalBakingDao personalBakingDao) {
		this.personalBakingDao = personalBakingDao;
	}

	@Override
	public BankStatement getMiniStatement() {
		return personalBakingDao.getMiniStatement();
	}
}
