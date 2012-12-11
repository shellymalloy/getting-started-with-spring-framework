package sample.spring.chapter05.springbankapp.service;

import java.util.Date;

import javax.inject.Inject;
import javax.inject.Named;

import sample.spring.chapter05.springbankapp.dao.AccountStatementDao;
import sample.spring.chapter05.springbankapp.domain.AccountStatement;

@Named(value="accountStatementService")
public class AccountStatementServiceImpl implements AccountStatementService {
	@Inject
	private AccountStatementDao accountStatementDao;
	
	@Override
	public AccountStatement getAccountStatement(Date from, Date to) {
		return accountStatementDao.getAccountStatement(from, to);
	}
}
