package string;

import java.util.Scanner;

public class FindPassword {

	public static void main(String[] args) {
		
		String uname="monika";
				String  unpass="1234";
				String un ,up;
				
				int c=1;
				
				{
					
				
				Scanner sc=new Scanner(System.in);
				System.out.println("your name");
				un=sc.next();
				System.out.println("your password");
				up=sc.next();
				
				if(un.equalsIgnoreCase(uname) && up.equals(unpass))
				{
					System.out.println("login successfully");
				
				}
				else {
					System.out.println("invalid user");
					
				c++;
				}
				while(c<=3);
				System.out.println(c+"attempts are over ");
				
	}

					
				}
	
	   }
	
	


