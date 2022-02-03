public class AccessSpecifiers {
    private int eid;
    protected String ename;
    float salary;
    public String compname;
    public AccessSpecifiers(){
    	
    }
	public AccessSpecifiers(int eid, String ename, float salary, String compname) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.compname = compname;
	}
}
class Company extends AccessSpecifiers{
	void display() {
		//System.out.println("Private id="+eid);//
		System.out.println("public compname="+compname);
		System.out.println("default salary="+salary);
		System.out.println("protected ename="+ename);
	}
	}

