package Employee_spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainApp {

	public static void main(String[] args) {
		{
			
			
			ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
			EmployeeInfo eob = (EmployeeInfo) ctx.getBean("emob");
			eob.display();
			System.out.println(eob);
			
		}

		}
	


	}


