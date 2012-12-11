package sample.spring.chapter01.springbankapp.controller;

import sample.spring.chapter01.springbankapp.domain.FixedDepositDetails;
import sample.spring.chapter01.springbankapp.service.FixedDepositService;

public interface FixedDepositController {
	FixedDepositService getFixedDepositService();

	boolean submit(FixedDepositDetails fixedDepositDetails);

	FixedDepositDetails get();
}
