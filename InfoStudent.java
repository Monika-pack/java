package first;
import java.util.Scanner;
public class InfoStudent {

	public static void main(String[] args) {
		int age;
		String name;
		float fees;
		char gender;
		double loan;
		Scanner sc = new Scanner (System.in);
		System.out.println("my name");
		name=sc.next();
		System.out.println("my age");
		age=sc.nextInt();
		System.out.println("my fees");
		fees = sc.nextFloat();
		System.out.println("gender m/f");
		gender=sc.nextLine().charAt(0);
		System.out.print("my loan");
		loan=sc.nextDouble();
		
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("fees="+fees);
		System.out.println("gender="+gender);		
		System.out.println("loan="+loan);

	
	}
}

	


