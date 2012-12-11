package sample.spring.chapter06.springbankapp.dao;

import sample.spring.chapter06.springbankapp.domain.BankAccountDetails;

public interface BankAccountDao {
	int createBankAccount(BankAccountDetails bankAccountDetails);
	void subtractFromAccount(int bankAccountId, int amount);
}
