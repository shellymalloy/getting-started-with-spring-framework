package sample.spring.chapter02.springbankapp.dao;

import sample.spring.chapter02.springbankapp.domain.FixedDepositDetails;

public interface FixedDepositDao {
	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);
}
