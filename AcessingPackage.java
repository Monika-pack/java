package accessingpackage;


class EmployeeAnotherPack    {
	   
    private int eid;
    protected String ename;
    float salary;
    public String compname;
    public EmployeeAnotherPack(){
    	
    }
	public EmployeeAnotherPack(int eid, String ename, float salary, String compname) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.compname = compname;
	}
}
    


class Company extends EmployeeAnotherPack{
	private String id;

	void display() {
		System.out.println("private id="+id);
		System.out.println("public compname="+compname);
		System.out.println("default salary="+salary);
		System.out.println("protected ename="+ename);
	}	

}
public class AcessingPackage {
	
	
	public static void main(String[] args) { 
		
	 Company(1, "monika",  12000.87f,  "TATA") ;
		Company ob=new Company() ;
	
		
				//System.out.println("id ="+ob.id);
				System.out.println("compname ="+ob.compname);
				System.out.println("salary="+ob.salary);
				System.out.println("ename="+ob.ename);
		EmployeeAnotherPack eob=new EmployeeAnotherPack(12,  "rosy",  13000.98f,  "TATA");
	   
				
				//System.out.println("id ="+eob.id);
				System.out.println("compname ="+eob.compname);
				System.out.println("salary="+eob.salary);
				System.out.println("ename="+eob.ename);
		}

	private static void Company(int i, String string, float f, String string2) {
		// TODO Auto-generated method stub
		
	}	
	}



