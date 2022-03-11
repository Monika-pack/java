package testing;


		import org.hibernate.Session;
		import org.hibernate.SessionFactory;
		import org.hibernate.Transaction;
		import org.hibernate.cfg.Configuration;
		import org.hibernate.service.ServiceRegistry;
		import org.hibernate.service.ServiceRegistryBuilder;

		public class MyMainApp {

			public static void main(String[] args) {
				EduEmployee eob=new EduEmployee();
				eob.setEid(14);
				eob.setEname("Monika");
				
				

				Configuration con=new Configuration().configure().addAnnotatedClass(EduEmployee.class);
				ServiceRegistry reg = ((ServiceRegistryBuilder) new ServiceRegistryBuilder()).applySettings(con.getProperties()).buildServiceRegistry();
				
				SessionFactory sf = con.buildSessionFactory(reg); 
				Session session = sf.openSession();
				Transaction tx=session.beginTransaction();
				session.save(eob);// insert but how
				tx.commit();
				System.out.println("Record saved");
			}
		

			}

		

	


