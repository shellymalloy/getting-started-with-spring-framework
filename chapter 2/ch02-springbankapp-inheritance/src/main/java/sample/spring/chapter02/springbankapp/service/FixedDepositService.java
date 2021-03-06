package sample.spring.chapter02.springbankapp.service;

import sample.spring.chapter02.springbankapp.dao.FixedDepositDao;
import sample.spring.chapter02.springbankapp.domain.FixedDepositDetails;

public interface FixedDepositService {
	FixedDepositDao getFixedDepositDao();

	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);

}
