package lapppstudent;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
public class Laptop {

	//public static void main(String[] args) {
		//@Entity
		//public class Laptop {
			@Id
			private int lid;
			private String lname;
			public int getLid() {
				return lid;
			}
			public void setLid(int lid) {
				this.lid = lid;
			}
			public String getLname() {
				return lname;
			}
			public void setLname(String lname) {
				this.lname = lname;
			}
			
		}

	


