package sample.spring.chapter02.springbankapp.dao;

import org.apache.log4j.Logger;

import sample.spring.chapter02.springbankapp.domain.FixedDepositDetails;
import sample.spring.chapter02.springbankapp.utils.DatabaseOperations;

public class FixedDepositDaoImpl implements FixedDepositDao {
	private static Logger logger = Logger.getLogger(FixedDepositDaoImpl.class);
	private DatabaseOperations databaseOperations;
	
	public void setDatabaseOperations(DatabaseOperations databaseOperations) {
		this.databaseOperations = databaseOperations;
	}
	
	public FixedDepositDaoImpl() {
		logger.info("initializing");
	}

	public FixedDepositDetails getFixedDepositDetails(long id) {
		return databaseOperations.loadFd(id);
	}

	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		return databaseOperations.saveFd(fdd);
	}
}
