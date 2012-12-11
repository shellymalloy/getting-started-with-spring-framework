package sample.spring.chapter06.springbankapp.service;

import sample.spring.chapter06.springbankapp.domain.BankAccountDetails;

public interface BankAccountService {
	int createBankAccount(BankAccountDetails bankAccountDetails);
}
