package spring_injection_setget;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





public class MainApp {
	public static void main(String[] args) {


	{
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Student sob = (Student) ctx.getBean("stob");
		sob.display();
		System.out.println(sob);
		
	}
	

	}
}


