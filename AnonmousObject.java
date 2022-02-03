package first;
class  Table  {
	 synchronized void print(int n,String g) {
			for(int i=1;i<=10;i++) {
			System.out.println("n x"+i+"="+n*i);
		}
			System.out.println("hii");
		}
}
public class AnonmousObject {

	public static void main(String[] args) {
	
		Table tb=new Table();
		Thread t=new Thread() {//anonymous class//
			
		public void run() {
			System.out.println("inside run");
			tb.print(8);
		}
		};
		t.start();
		Thread t1=new Thread() {
			public void run() {
				System.out.println("inside run");
				tb.print(4);
		}
		};
		t1.start();
		
new Thread() 
{
	//anonymous class with anonmyous object//

	public void run() {
	tb.print(9);
	}	
}.start();
}
	}

