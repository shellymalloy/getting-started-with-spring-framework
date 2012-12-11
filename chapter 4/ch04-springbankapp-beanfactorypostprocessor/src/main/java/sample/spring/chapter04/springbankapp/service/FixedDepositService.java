package sample.spring.chapter04.springbankapp.service;

public interface FixedDepositService {
	void createFixedDeposit(long id, float depositAmount, int tenure,
			String email) throws Exception;
}
