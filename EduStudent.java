import java.util.Scanner;
class EduStudent {
protected int id;
protected long name;
protected float fees;
private int studentpass;

class EdubridgeClass extends EduStudent{
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		name = sc.nextInt();
		System.out.println("enter id");
		
		
		id=sc.nextInt();
		System.out.println("enter fees");
		fees=sc.nextFloat();
		
		
	}
}
		public class EduStudentMainClass {
			
		public  void main(String[] args) {
			
		
			EduStudent sob = new EduStudent().display();
	
		
			
			((EdubridgeClass) sob).accept();
			sob.accept();
		}	
		}
		public void accept() {
		}
		public EduStudent display() {
			// TODO Auto-generated method stub
			return null;
			}
			
		
	}


