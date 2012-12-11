package sample.spring.chapter02.springbankapp.service;

import java.util.HashMap;
import java.util.Map;

import sample.spring.chapter02.springbankapp.dao.FixedDepositDao;
import sample.spring.chapter02.springbankapp.domain.FixedDepositDetails;
import sample.spring.chapter02.springbankapp.event.EventSender;
import sample.spring.chapter02.springbankapp.event.FixedDepositCreatedEvent;

public class FixedDepositServiceImpl implements FixedDepositService {
	private FixedDepositDao fixedDepositDao;
	private EventSender eventSender;
	
	public void setEventSender(EventSender eventSender) {
		this.eventSender = eventSender;
	}
	
	public void setFixedDepositDao(FixedDepositDao fixedDepositDao) {
		this.fixedDepositDao = fixedDepositDao;
	}
	
	@Override
	public void createFixedDeposit(FixedDepositDetails fdd) {
		//-- create fixed deposit 
		fixedDepositDao.createFixedDeposit(fdd);
		
		//-- create the event that corresponds to creating fixed deposits
		FixedDepositCreatedEvent event = new FixedDepositCreatedEvent();
		Map<String, Object> eventData = new HashMap<String, Object>();
		eventData.put("amount", fdd.getDepositAmount());
		event.setEventData(eventData);
		
		//--send the event to the event sender
		eventSender.sendEvent(event);
	}
	
}
