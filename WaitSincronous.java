package first;
class MyClass extends Thread{
	int total;
	public void run() {
		synchronized (this) {
			
		for(int i=2;i<=50;i++) {//loop proceesing checking how many waits are there (idea covered)//
			total+=i;
			
			
		}
		notify();
		
	}
}
}

public class WaitSincronous {

	public static void main(String[] args) throws InterruptedException {
		MyClass t=new MyClass();  //Thread-0 , main
		t.start();
		synchronized (t) {
			
			 System.out.println("Waiting for Total");
		          t.wait();//
		          System.out.println("Total "+t.total);
		     }
    }

//public class WaitSincronous {

	//public static void main(String[] args) {
		
	}


