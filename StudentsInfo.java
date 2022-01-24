package OOPS;
import java.io.*;  

 class Student {
	
	String name;
	int id;
	float fees;
	char gen;
	int age ;
	//mrthod//
 
		void input() throws IOException {
			
			/*Scanner sc=new Scanner(System.in);*/
			//first create InputStreamReader
			InputStreamReader is=new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);
			
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			//2 methods 
			//read()->ascii value, readLine()->String
			
			System.out.println("Enter name");
			name=br.readLine();
			System.out.println("Enter Student id");
			id=Integer.parseInt(br.readLine());
			System.out.println("Enter Fees");
			fees=Float.parseFloat(br.readLine());
			System.out.println("Enter gender");
			gen=br.readLine().charAt(0);
			System.out.println("Enter age");
			age=Integer.parseInt(br.readLine()); 
			
		}

 void display() {
		System.out.println("enter name ="+name);
	    System.out.println("enter id="+id);
		System.out.println("enter age="+age);
		System.out.println("enter gen="+gen);
		System.out.println("enter fees="+fees);
	}
 }
	public class StudentsInfo {
		
	
	public static void main(String[] args) throws IOException {	
		
		System.out.println("enter main method");
Student sob=new Student ();
Student sob1=new Student ();
System.out.println("name="+sob.name);
System.out.println("id="+sob.id);
System.out.println("age="+sob.age);
System.out.println("gen="+sob.gen);
System.out.println("fees="+sob.fees);
System.out.println(sob);
System.out.println(sob1);
sob.input();
sob.display();
sob1.input();
sob1.display();
	}
	}
		
	
	
