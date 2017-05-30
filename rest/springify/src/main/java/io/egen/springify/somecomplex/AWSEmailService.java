package io.egen.springify.somecomplex;

import org.springframework.stereotype.Component;

@Component("awsVersion")
public class AWSEmailService implements EmailService {

	@Override
	public void sendEmail(String to, String body) {

		System.out.println("AWS Email Service");
		System.out.println("Sending Email To: "+to);
		System.out.println("Message :"+body);
	}

}
