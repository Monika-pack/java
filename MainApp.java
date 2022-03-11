package spring_inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
public class MainApp {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
	ctx = new ClassPathXmlApplicationContext("spring.xml");
	
	HellowWorld objA =(HellowWorld)  ctx.getBean("in");
	objA.getMessages1();
		objA.getMessages2();
			
	
			HellowIndia objB =(HellowIndia)  ctx.getBean("in");
	objB.getMessages1();
		objB.getMessages2();
			objB.getMessages3();
			
	}

}
