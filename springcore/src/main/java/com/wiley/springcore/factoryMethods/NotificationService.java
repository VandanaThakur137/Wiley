package com.wiley.springcore.factoryMethods;

public class NotificationService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();

	}

}
