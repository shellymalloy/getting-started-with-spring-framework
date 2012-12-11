package sample.spring.chapter06.springbankapp.service;

import sample.spring.chapter06.springbankapp.domain.FixedDepositDetails;


public interface FixedDepositService {
	int createFixedDeposit(FixedDepositDetails fdd) throws Exception;
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
}
