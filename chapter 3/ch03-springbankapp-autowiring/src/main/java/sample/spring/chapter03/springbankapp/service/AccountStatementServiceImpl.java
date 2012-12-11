package sample.spring.chapter03.springbankapp.service;

import java.util.Date;

import sample.spring.chapter03.springbankapp.dao.AccountStatementDao;
import sample.spring.chapter03.springbankapp.domain.AccountStatement;

public class AccountStatementServiceImpl implements AccountStatementService {
	private AccountStatementDao accountStatementDao;
	
	public void setAccountStatementDao(AccountStatementDao accountStatementDao) {
		this.accountStatementDao = accountStatementDao;
	}

	@Override
	public AccountStatement getAccountStatement(Date from, Date to) {
		return accountStatementDao.getAccountStatement(from, to);
	}
}
