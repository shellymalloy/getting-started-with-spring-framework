package sample.spring.chapter01.springbankapp.dao;

import sample.spring.chapter01.springbankapp.domain.FixedDepositDetails;

public interface FixedDepositDao {
	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);
}
