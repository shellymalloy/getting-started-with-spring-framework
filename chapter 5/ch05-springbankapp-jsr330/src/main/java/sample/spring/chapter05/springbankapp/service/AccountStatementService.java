package sample.spring.chapter05.springbankapp.service;

import java.util.Date;

import sample.spring.chapter05.springbankapp.domain.AccountStatement;

public interface AccountStatementService {
	public AccountStatement getAccountStatement(Date from, Date to);
}
