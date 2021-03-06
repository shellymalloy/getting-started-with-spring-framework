package sample.spring.chapter05.springbankapp.dao;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import sample.spring.chapter05.springbankapp.domain.AccountStatement;

@Repository(value="accountStatementDao")
public class AccountStatementDaoImpl implements AccountStatementDao {
	private static Logger logger = Logger.getLogger(AccountStatementDaoImpl.class);
	
	@Override
	public AccountStatement getAccountStatement(Date from, Date to) {
		logger.info("Getting account statement");
		return new AccountStatement();
	}

}
