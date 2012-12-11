package sample.spring.chapter04.springbankapp.service;

import sample.spring.chapter04.springbankapp.dao.FixedDepositDao;

public class FixedDepositServiceImpl implements FixedDepositService {
	private FixedDepositDao fixedDepositDao;

	public void setFixedDepositDao(FixedDepositDao fixedDepositDao) {
		this.fixedDepositDao = fixedDepositDao;
	}

	@Override
	public void createFixedDeposit(long id, float depositAmount, int tenure,
			String email) throws Exception {
		// -- create fixed deposit
		fixedDepositDao.createFixedDeposit(id, depositAmount, tenure, email);
	}
}
