package onetooneRelations;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {

	public static void main(String[] args) {
		
		//Laptop 
				Laptop lob=new Laptop();
				lob.setLid(3);
				lob.setLname("Samsung1");
				
				Laptop lob2=new Laptop();
				lob.setLid2(3);
				lob.setLname2("peacock2");
				
				Student sob=new Student();
				sob.setRollno(13);
				sob.setName("Swetha1");
				sob.setMarks(457);
				sob.setLp(lob);
				
				Student sob2=new Student();
				sob.setRollno(13);
				sob.setName("Swetha1");
				sob.setMarks(457);
				sob.setLp(lob);
				
				Configuration con=new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
				ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
				
				//SessionFactory sf = con.buildSessionFactory(); //deprecated
				SessionFactory sf = con.buildSessionFactory(reg); //not deprecated
				Session session = sf.openSession();
				Transaction tx=session.beginTransaction();
				session.save(lob);
				session.save(sob);
				tx.commit();
			
	
		
	
	}

}
