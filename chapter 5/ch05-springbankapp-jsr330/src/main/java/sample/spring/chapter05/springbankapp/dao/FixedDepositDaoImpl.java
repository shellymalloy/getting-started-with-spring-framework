package sample.spring.chapter05.springbankapp.dao;

import javax.inject.Named;

import sample.spring.chapter05.springbankapp.domain.FixedDepositDetails;

@Named(value="myFixedDepositDao")
public class FixedDepositDaoImpl implements FixedDepositDao {
	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		// -- save the fixed deposits and then return true
		return true;
	}
}
