package retrivedata;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class RetrieveData {

	public static void main(String[] args) {
		
		Configuration con=new Configuration().configure().addAnnotatedClass(ClassWithGetSet.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		//SessionFactory sf = con.buildSessionFactory(); //deprecated
		SessionFactory sf = con.buildSessionFactory(reg); //not deprecated
		Session session = sf.openSession();
		Transaction tx=session.beginTransaction();
		//session.save(eob1);// insert but how
	
		/* for all data 
	//	tx.commit();
		System.out.println("Saved");
		
		//Selecting All Records
		Query query = session.createQuery("from ClassWithGetSet e");
		//select * from table
		
		List qryResults = query.list();

		Iterator<ClassWithGetSet> it =qryResults.iterator();
		while (it.hasNext()) {
			ClassWithGetSet emp =  it.next();
		System.out.println("Employee id : " + emp.getSid()
		+ " , Sname : " + emp.getSname());
		}

		*/
		
		//Reading Single Column
	Query query1 = session.createQuery("select e.sid from ClassWithGetSet e");
		List qryResults1 = query1.list();

		Iterator it1 =qryResults1.iterator();
		
		while (it1.hasNext()) {
			
			Integer sid = (Integer) it1.next();
			System.out.println("id : " + sid);
			}

		
         //Reading the partial entity :
		Query query2 = session.createQuery("select e.sid , e.sname from ClassWithGetSet e");
		List qryResults2 = query2.list();

		
		Iterator  it2 =qryResults2.iterator();
		while (it2.hasNext()) {
		Object[] object = (Object[]) it2.next();
		System.out.println("Name : " + object[0]
		+ " Salary : " + object[1]);
		}

		//HQL Query with parameters :
		//HQL : from Employee e where e.deptNumber = ?

		//		OR

		//		HQL : from Employee e where e.deptNumber =:deptNo;

       Query query3 = session.createQuery("from ClassWithGetSet e where e.sid=?");

       query3.setParameter(0,1);

     List<ClassWithGetSet> qryResults3 = query3.list();
     Iterator<ClassWithGetSet> it3 =qryResults3.iterator();
     while(it3.hasNext()) {
    	ClassWithGetSet ob=(ClassWithGetSet) it3.next();
    	System.out.println(ob.getSid()+" "+ob.getSname());
    }
    
    
    //Criteria
    /*
    System.out.println("Reading Complete Entity");

    Criteria crit = session.createCriteria(EmployeeClassHib.class);
    List list = crit.list();

    Iterator it5 = list.iterator();

    while (it5.hasNext()) {
    	EmployeeClassHib emp = (EmployeeClassHib) it5.next();
        System.out.println("Employee : " + emp.toString());

    }

    //Restricrition Criteria
    System.out.println("Based on Criterion");
    Criteria crit2 = session.createCriteria(EmployeeClassHib.class);

    Criterion criterion = Restrictions.eq("eid", 1);

    crit2.add(criterion);

    List list2 = crit2.list();

    Iterator it6 = list2.iterator();

    while (it6.hasNext()) {
    	EmployeeClassHib emp = (EmployeeClassHib) it6.next();
        System.out.println("Employee : " + emp.toString());
    }*/
    session.close();
	}

	}


