package sample.spring.chapter03.springbankapp.dao;

import sample.spring.chapter03.springbankapp.domain.FixedDepositDetails;

public interface FixedDepositDao {
	boolean createFixedDeposit(FixedDepositDetails fdd);
}
