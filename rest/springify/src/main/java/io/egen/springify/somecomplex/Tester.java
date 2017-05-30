package io.egen.springify.somecomplex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		
		NotificationService service=context.getBean(NotificationService.class);
		
		service.sendNotification("mohammedosman@gmail.com", "It is pratice email notification.");
		
		context.close();
		
	}

}
