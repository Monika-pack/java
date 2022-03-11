package programss4;
import java.util.HashMap;
import java.util.Map;
public class StudentPriorInfo {

	

	
	public static void main(String[] args) {
		int sid;
		float fees;
		String name;
		
		
	public static  StudentPriorInfo( int sid,float fees,String name);
		
		super();
		this.name=name;
		this.sid=sid;
		this.fees=fees;
	
		HashMap<Integer,Student>hb=new HashMap<Integer,Student>();
			
	    Student s1=new Student(7,"ajith",4567.9f);

		Student s2=new Student(2,"kamaly",5567.9f);

		Student s3=new Student(5,"sreejah",6567.9f);

		Student s4=new Student(8,"kowshal",4567.9f);
		hb.put(1,s1);
		hb.put(2,s2);
		hb.put(5,s3);
		hb.put(8,s4);
		 for(Map.Entry <Integer,Student> m:hb.entrySet()){    
		
				Student s=m.getValue();
			
		 }
	           System.out.println(m.getKey()+" "+m.getValue());    
	
	}
}

