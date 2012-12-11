package sample.spring.chapter08.springbankapp.service;

import sample.spring.chapter08.springbankapp.domain.BankAccountDetails;

public interface BankAccountService {
	int createBankAccount(BankAccountDetails bankAccountDetails);
}
