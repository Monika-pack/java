package testing;
//EduEmployee.java;


import org.hibernate.service.ServiceRegistryBuilder;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EduEmployee {
	@Id
	private int eid;
	
	private String ename;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	

}