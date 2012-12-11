package sample.spring.chapter07.springbankapp.service;

import sample.spring.chapter07.springbankapp.domain.BankAccountDetails;

public interface BankAccountService {
	int createBankAccount(BankAccountDetails bankAccountDetails);
}
