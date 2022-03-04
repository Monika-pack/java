package retrivedata;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class ClassWithGetSet {
	@Id  
	int sid;
	String sname;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSalary() {
		// TODO Auto-generated method stub
		return null;
	}
	

}


