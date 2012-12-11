package sample.spring.chapter02.springbankapp.controller;

public class ControllerFactory {
	public Object getController(String controllerName) {
		Object controller = null;
		if ("fixedDepositController".equalsIgnoreCase(controllerName)) {
			controller = new FixedDepositControllerImpl();
		}
		if ("personalBankingController".equalsIgnoreCase(controllerName)) {
			controller = new PersonalBankingControllerImpl();
		}
		return controller;
	}
}
