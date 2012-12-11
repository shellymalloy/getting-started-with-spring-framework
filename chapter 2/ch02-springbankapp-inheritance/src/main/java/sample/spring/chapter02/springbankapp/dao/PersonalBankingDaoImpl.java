package sample.spring.chapter02.springbankapp.dao;

import sample.spring.chapter02.springbankapp.domain.BankStatement;
import sample.spring.chapter02.springbankapp.utils.DatabaseOperations;

public class PersonalBankingDaoImpl implements PersonalBakingDao {
	private DatabaseOperations databaseOperations;

	public void setDatabaseOperations(DatabaseOperations databaseOperations) {
		this.databaseOperations = databaseOperations;
	}

	@Override
	public BankStatement getMiniStatement() {
		return databaseOperations.getMiniStatement();
	}
}
