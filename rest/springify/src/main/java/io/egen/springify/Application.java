package io.egen.springify;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class Application {

	@Bean()
	@Scope("prototype")
	public Hello getHello(){
		return new Hello("3.3.3.Release");
	}
	
//	@Bean()
//	@Scope("prototype")
//	public Hello getHelloInt(){
//		return new Hello(123);
//	}
}
