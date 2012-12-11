package sample.spring.chapter02.springbankapp.dao;

import sample.spring.chapter02.springbankapp.domain.FixedDepositDetails;

public interface FixedDepositDao {
	boolean createFixedDeposit(FixedDepositDetails fdd);
}
