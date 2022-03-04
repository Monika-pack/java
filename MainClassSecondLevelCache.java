package second_level_cache;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainClassSecondLevelCache {

	public static void main(String[] args) {
		EdubridgeAlian ob=null;
		Configuration con=new Configuration().configure().addAnnotatedClass(EdubridgeAlian.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		//SessionFactory sf = con.buildSessionFactory(); //deprecated
		SessionFactory sf = con.buildSessionFactory(reg); //not deprecated
		Session session = sf.openSession();
	
		
		  Transaction tx=session.beginTransaction();
		ob=(EdubridgeAlian) session.get(EdubridgeAlian.class,3);
		System.out.println(ob);
		tx.commit();
		session.close();
		Session session1 = sf.openSession();
		
		
		  Transaction tx1=session1.beginTransaction();
		ob=(EdubridgeAlian) session1.get(EdubridgeAlian.class,3);
		
		//start session session
		ob=(EdubridgeAlian) session1.get(EdubridgeAlian.class,3);
		System.out.println(ob);
		tx1.commit();
		session1.close();
		
		
		
		
		

	}





	}


