package sample.spring.chapter05.springbankapp.dao;

import sample.spring.chapter05.springbankapp.domain.FixedDepositDetails;

public interface FixedDepositDao {
	boolean createFixedDeposit(FixedDepositDetails fdd);
}
