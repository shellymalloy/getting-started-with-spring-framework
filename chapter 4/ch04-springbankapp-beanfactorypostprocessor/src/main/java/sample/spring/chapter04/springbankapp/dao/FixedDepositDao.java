package sample.spring.chapter04.springbankapp.dao;

public interface FixedDepositDao {
	boolean createFixedDeposit(long id, float depositAmount, int tenure,
			String email);
}
