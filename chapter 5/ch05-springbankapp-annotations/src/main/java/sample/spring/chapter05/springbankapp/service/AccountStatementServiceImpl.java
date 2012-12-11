package sample.spring.chapter05.springbankapp.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.spring.chapter05.springbankapp.dao.AccountStatementDao;
import sample.spring.chapter05.springbankapp.domain.AccountStatement;

@Service(value="accountStatementService")
public class AccountStatementServiceImpl implements AccountStatementService {
	@Autowired
	private AccountStatementDao accountStatementDao;
	
	@Override
	public AccountStatement getAccountStatement(Date from, Date to) {
		return accountStatementDao.getAccountStatement(from, to);
	}
}
