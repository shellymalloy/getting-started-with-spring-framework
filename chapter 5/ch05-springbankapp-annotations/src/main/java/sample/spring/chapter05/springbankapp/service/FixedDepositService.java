package sample.spring.chapter05.springbankapp.service;

import sample.spring.chapter05.springbankapp.domain.FixedDepositDetails;


public interface FixedDepositService {
	void createFixedDeposit(FixedDepositDetails fdd) throws Exception;
}
