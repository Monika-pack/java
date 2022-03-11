package spring_lifecycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		 ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
	       springcycle s=(springcycle) ctx.getBean("lob");
	       ((AbstractApplicationContext)ctx).registerShutdownHook();
		}


	}


