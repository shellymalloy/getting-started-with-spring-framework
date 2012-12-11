package sample.spring.chapter03.springbankapp.service;

import sample.spring.chapter03.springbankapp.dao.FixedDepositDao;
import sample.spring.chapter03.springbankapp.domain.FixedDepositDetails;

public class FixedDepositServiceImpl implements FixedDepositService {
	private FixedDepositDao myFixedDepositDao;

	public void setMyFixedDepositDao(FixedDepositDao myFixedDepositDao) {
		this.myFixedDepositDao = myFixedDepositDao;
	}

	@Override
	public void createFixedDeposit(FixedDepositDetails fdd) throws Exception {
		// -- create fixed deposit
		myFixedDepositDao.createFixedDeposit(fdd);
	}
}
