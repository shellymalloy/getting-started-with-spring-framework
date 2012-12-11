package sample.spring.chapter06.springbankapp.dao;

import sample.spring.chapter06.springbankapp.domain.FixedDepositDetails;

public interface FixedDepositDao {
	int createFixedDeposit(FixedDepositDetails fdd);
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
