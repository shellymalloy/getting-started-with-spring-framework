package sample.spring.chapter04.springbankapp.service;

import org.apache.log4j.Logger;

import sample.spring.chapter04.springbankapp.common.DependencyResolver;
import sample.spring.chapter04.springbankapp.common.MyApplicationContext;
import sample.spring.chapter04.springbankapp.dao.FixedDepositDao;
import sample.spring.chapter04.springbankapp.domain.FixedDepositDetails;

public class FixedDepositServiceImpl implements FixedDepositService,
		DependencyResolver {
	private static Logger logger = Logger
			.getLogger(FixedDepositServiceImpl.class);
	private FixedDepositDao fixedDepositDao;

	@Override
	public void createFixedDeposit(FixedDepositDetails fdd) throws Exception {
		// -- create fixed deposit
		fixedDepositDao.createFixedDeposit(fdd);
	}

	@Override
	public void resolveDependency(MyApplicationContext myApplicationContext) {
		logger.info("Resolving dependencies of FixedDepositServiceImpl instance");
		fixedDepositDao = myApplicationContext.getBean(FixedDepositDao.class);
	}
}
