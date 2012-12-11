package sample.spring.chapter03.springbankapp.service;

import java.util.Date;

import sample.spring.chapter03.springbankapp.domain.AccountStatement;

public interface AccountStatementService {
	public AccountStatement getAccountStatement(Date from, Date to);
}
