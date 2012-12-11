package sample.spring.chapter05.springbankapp.service;

import javax.inject.Inject;
import javax.inject.Named;

import sample.spring.chapter05.springbankapp.dao.FixedDepositDao;
import sample.spring.chapter05.springbankapp.domain.FixedDepositDetails;

@Named(value="fixedDepositService")
public class FixedDepositServiceImpl implements FixedDepositService {
	
	@Inject
	@Named(value="myFixedDepositDao")
	private FixedDepositDao myFixedDepositDao;
	
	@Override
	public void createFixedDeposit(FixedDepositDetails fdd) throws Exception {
		// -- create fixed deposit
		myFixedDepositDao.createFixedDeposit(fdd);
	}
}
