package sample.spring.chapter04.springbankapp.service;

import org.apache.log4j.Logger;

import sample.spring.chapter04.springbankapp.dao.FixedDepositDao;
import sample.spring.chapter04.springbankapp.domain.FixedDepositDetails;

public class FixedDepositServiceImpl implements FixedDepositService {
	private static Logger logger = Logger.getLogger(FixedDepositServiceImpl.class);
	private FixedDepositDao myFixedDepositDao;

	public void setMyFixedDepositDao(FixedDepositDao myFixedDepositDao) {
		logger.info("FixedDepositServiceImpl's setMyFixedDepositDao method invoked");
		this.myFixedDepositDao = myFixedDepositDao;
	}

	@Override
	public void createFixedDeposit(FixedDepositDetails fdd) throws Exception {
		// -- create fixed deposit
		myFixedDepositDao.createFixedDeposit(fdd);
	}
}
