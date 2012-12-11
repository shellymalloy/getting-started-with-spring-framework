package sample.spring.chapter08.springbankapp.dao;

import sample.spring.chapter08.springbankapp.domain.BankAccountDetails;

public interface BankAccountDao {
	int createBankAccount(BankAccountDetails bankAccountDetails);
	void subtractFromAccount(int bankAccountId, int amount);
}
