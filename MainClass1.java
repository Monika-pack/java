package retrivedata;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainClass1 {

	public static void main(String[] args) {
		ClassWithGetSet ob1 = new ClassWithGetSet();
		ob1.setSid(7);
		ob1.setSname("JamesBond");
		
		Configuration con=new Configuration().configure().addAnnotatedClass(ClassWithGetSet.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		//SessionFactory sf = con.buildSessionFactory(); //deprecated
		SessionFactory sf = con.buildSessionFactory(reg); //not deprecated
		Session session = sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(ob1);// insert but how
		
		tx.commit();
		System.out.println(session.isConnected());
		session.close();
		System.out.println(session.isConnected());
		
	}



	}


