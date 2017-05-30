package io.egen.springify;

//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//@Component
//@Scope("prototype")
public class Hello {
	
	//private final String version;
	
	
	public Hello(String ver) {
		System.out.println(ver);
	}
	public Hello(int ver) {
		System.out.println(ver);
	}
	
	public void sayHello(){
		System.out.println("Version is : ");
	}
}
