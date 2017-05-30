package io.egen.springify.somecomplex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
	
	//Property base DI
	@Autowired
	@Qualifier("awsVersion")
	private EmailService emailService;
	
	//Constructor base DI
	//	public NotificationService(EmailService emailService) {
	//		this.emailService = emailService;
	//	}
	
	public void sendNotification(String to,String body){
		emailService.sendEmail(to,body);
	}
}
