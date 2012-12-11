package sample.spring.chapter05.springbankapp.service;

public interface CustomerRegistrationService {
	void setAccountNumber(String accountNumber);
	void setAddress(String address);
	void setDebitCardNumber(String cardNumber);
	void register();
}
