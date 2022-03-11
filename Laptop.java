package onetooneRelations;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Laptop {
	@Id
	private int lid;
	private int lid2;
	private String lname;
	private String lname2;
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public int getLid2() {
		return lid2;
	}
	public void setLid2(int lid2) {
		this.lid2 = lid2;
	}
	
	
	
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	




public String getLname2() {
	return lname2;
}
public void setLname2(String lname2) {
	this.lname2 = lname2;
}

}

