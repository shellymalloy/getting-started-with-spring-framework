package sample.spring.chapter04.springbankapp.service;

import sample.spring.chapter04.springbankapp.domain.FixedDepositDetails;


public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
}
