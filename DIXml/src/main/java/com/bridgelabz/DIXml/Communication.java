package com.bridgelabz.DIXml;

public class Communication {

	private Messaging messaging;
	
	public void setMessaging(Messaging messaging) {
		this.messaging = messaging;
	}
	
	public void communicate() {
		messaging.sendMessage();
	}
}
