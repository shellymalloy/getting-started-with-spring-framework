package sample.spring.chapter07.springbankapp.dao;

import sample.spring.chapter07.springbankapp.domain.BankAccountDetails;

public interface BankAccountDao {
	int createBankAccount(BankAccountDetails bankAccountDetails);
	void subtractFromAccount(int bankAccountId, int amount);
}
