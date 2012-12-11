package sample.spring.chapter05.springbankapp.dao;

import java.util.Date;

import sample.spring.chapter05.springbankapp.domain.AccountStatement;

public interface AccountStatementDao {
	public AccountStatement getAccountStatement(Date from, Date to);
}
