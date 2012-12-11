package sample.spring.chapter02.springbankapp.controller;

import sample.spring.chapter02.springbankapp.domain.FixedDepositDetails;
import sample.spring.chapter02.springbankapp.service.FixedDepositService;

public interface FixedDepositController {
	FixedDepositService getFixedDepositService();

	boolean submit(FixedDepositDetails fixedDepositDetails);

	FixedDepositDetails get();
}
