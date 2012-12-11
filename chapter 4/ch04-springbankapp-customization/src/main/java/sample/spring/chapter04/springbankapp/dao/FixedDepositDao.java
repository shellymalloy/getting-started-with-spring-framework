package sample.spring.chapter04.springbankapp.dao;

import sample.spring.chapter04.springbankapp.domain.FixedDepositDetails;

public interface FixedDepositDao {
	boolean createFixedDeposit(FixedDepositDetails fdd);
}
