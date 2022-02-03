package first;
class MyThread extends Thread 
{
	public void run() {
		System.out.println("child Thread"+Thread.currentThread());
	}
		void display() {
			System.out.println("display"+Thread.currentThread());
		}
	}

public class ThreadFunction {

	public static void main(String[] args) {
		System.out.println("child Thread"+Thread.currentThread());
		MyThread ob=new MyThread();
		ob.display();
		
	}

}
