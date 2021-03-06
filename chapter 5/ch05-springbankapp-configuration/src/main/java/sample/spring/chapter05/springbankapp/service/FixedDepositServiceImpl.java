package sample.spring.chapter05.springbankapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sample.spring.chapter05.springbankapp.dao.FixedDepositDao;
import sample.spring.chapter05.springbankapp.domain.FixedDepositDetails;

public class FixedDepositServiceImpl implements FixedDepositService {
	
	@Autowired
	@Qualifier(value="myFixedDepositDao")
	private FixedDepositDao myFixedDepositDao;
	
	@Override
	public void createFixedDeposit(FixedDepositDetails fdd) throws Exception {
		// -- create fixed deposit
		myFixedDepositDao.createFixedDeposit(fdd);
	}
}
