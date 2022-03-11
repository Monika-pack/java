package spring_hellow;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	private static String s;

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Student s1=(Student) ctx.getBean("stob");
	
		System.out.println("s="+s);
		System.out.println("s1="+s1);
		
		 //Student s1=(Student) ctx.getBean("s1");
		   s1.display();

			}
		


	}


