package sample.spring.chapter01.springbankapp.service;

import sample.spring.chapter01.springbankapp.dao.FixedDepositDao;
import sample.spring.chapter01.springbankapp.domain.FixedDepositDetails;

public interface FixedDepositService {
	FixedDepositDao getFixedDepositDao();

	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);

}
