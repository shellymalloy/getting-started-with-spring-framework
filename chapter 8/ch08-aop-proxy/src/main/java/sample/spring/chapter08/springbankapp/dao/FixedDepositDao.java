package sample.spring.chapter08.springbankapp.dao;

import sample.spring.chapter08.springbankapp.domain.FixedDepositDetails;

public interface FixedDepositDao {
	int createFixedDeposit(FixedDepositDetails fdd);
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
