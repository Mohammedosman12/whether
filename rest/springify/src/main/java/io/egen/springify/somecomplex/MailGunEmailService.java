package io.egen.springify.somecomplex;

import org.springframework.stereotype.Component;

@Component("mailGunVersion")
public class MailGunEmailService implements EmailService{

	@Override
	public void sendEmail(String to, String body) {
		
		System.out.println("MailGun Email Service");
		System.out.println("Sending Email To: "+to);
		System.out.println("Message :"+body);
		
	}

}
