package sample.spring.chapter03.springbankapp.dao;

import java.util.Date;

import sample.spring.chapter03.springbankapp.domain.AccountStatement;

public interface AccountStatementDao {
	public AccountStatement getAccountStatement(Date from, Date to);
}
