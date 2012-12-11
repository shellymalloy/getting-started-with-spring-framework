package sample.spring.chapter03.springbankapp.service;

import sample.spring.chapter03.springbankapp.domain.FixedDepositDetails;


public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
}
