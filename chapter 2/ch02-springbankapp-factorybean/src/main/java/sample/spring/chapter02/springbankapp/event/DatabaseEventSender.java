package sample.spring.chapter02.springbankapp.event;

import java.util.Properties;

public class DatabaseEventSender implements EventSender {
	@SuppressWarnings("unused")
	private Properties databaseProperties;

	public DatabaseEventSender(Properties databaseProperties) {
		this.databaseProperties = databaseProperties;
	}

	@Override
	public void sendEvent(Event e) {
		// -- save events in the database
	}

}
