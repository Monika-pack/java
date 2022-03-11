package capgemini3;
import java.util.Scanner;
public  class ShowRoom {

	//public static void main(String[] args) {
		private String name;
	    private long mobno;
	    private double cost;
	    private double dis;
	    private double amount;

	    public ShowRoom()
	    {
	        name = "";
	        mobno = 0;
	        cost = 0.0;
	        dis = 0.0;
	        amount = 0.0;
	    }

	    public void input() {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter customer name: ");
	        name = in.nextLine();
	        System.out.print("Enter customer mobile no: ");
	        mobno = in.nextLong();
	        System.out.print("Enter cost: ");
	        cost = in.nextDouble();
	    }
	    
	    public void calculate() {
	        int disPercent = 0;
	        if (cost <= 10000)
	            disPercent = 5;
	        else if (cost <= 20000)
	            disPercent = 10;
	        else if (cost <= 35000)
	            disPercent = 15;
	        else
	            disPercent = 20;
	        
	        dis = cost * disPercent / 100.0;
	        amount = cost - dis;
	    }
	    
	    public void display() {
	        System.out.println("Customer Name: " + name);
	        System.out.println("Mobile Number: " + mobno);
	        System.out.println("Amout after discount: " + amount);
	    }

	    public static void main(String args[]) {
	        ShowRoom obj = new ShowRoom();
	        obj.input();
	        obj.calculate();
	        obj.display();
	    }




	}


