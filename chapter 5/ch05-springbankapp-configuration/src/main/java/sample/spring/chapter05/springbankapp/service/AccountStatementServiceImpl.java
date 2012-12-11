package sample.spring.chapter05.springbankapp.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import sample.spring.chapter05.springbankapp.dao.AccountStatementDao;
import sample.spring.chapter05.springbankapp.domain.AccountStatement;

public class AccountStatementServiceImpl implements AccountStatementService {
	@Autowired
	private AccountStatementDao accountStatementDao;

	@Override
	public AccountStatement getAccountStatement(Date from, Date to) {
		return accountStatementDao.getAccountStatement(from, to);
	}
}
