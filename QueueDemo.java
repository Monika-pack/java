import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
//queue:add(),offer(),remove(),poll(),element(),peek()//
public class QueueDemo {
                                //PROGRAM BASED ON STACK METHODS//
	public static void main(String[] args) {
		Queue<String>obq=new LinkedList<>();
		obq.add("rani");
		obq.add("kiran");
		obq.add("ramesh");
		obq.remove();
		obq.poll();
		System.out.println(obq);
	
	}
		                     //PROGRAM BASED ON PRIORITY QUEUSE CHECKED//
		
	//Queue<Integer>obq=new PriorityQueue<>();
	//obq.add(1);
	//obq.add(8);
	//obq.add(9);
	//obq.add(6);
	//obq.add(10);
	//System.out.println("queue"+obq);
}//
//}

