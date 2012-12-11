package sample.spring.chapter03.springbankapp.dao;

import java.util.Date;

import org.apache.log4j.Logger;

import sample.spring.chapter03.springbankapp.domain.AccountStatement;

public class AccountStatementDaoImpl implements AccountStatementDao {
	private static Logger logger = Logger.getLogger(AccountStatementDaoImpl.class);
	
	@Override
	public AccountStatement getAccountStatement(Date from, Date to) {
		logger.info("Getting account statement");
		return new AccountStatement();
	}

}
