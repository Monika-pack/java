package capgemini4;
import java.util.Scanner;  
public class TechNumbers {

	public static void main(String[] args) {
		{  //////declaration user input//////
			int n, num, firstHalf, secondHalf, digits = 0, squareOfSum = 0;  
			Scanner sc = new Scanner(System.in);  
			System.out.print("Enter a number to check: ");  
			 /////////next line of the user input using nextInt()////
			n = sc.nextInt();  
			
			num = n;  
			///////////check the given num  while loop concept //////
			while (num > 0)  
			{  
			  
			digits++;  
			
			num = num / 10;  
			}  
			 ////////typecaste use///////
			if (digits % 2 == 0)  
			{  
			num = n;  
			
			firstHalf = num % (int) Math.pow(10, digits / 2);  
			
			secondHalf = num / (int) Math.pow(10, digits / 2);  
			
			squareOfSum = (firstHalf + secondHalf) * (firstHalf + secondHalf);  
			////////////// if loop whether the given num is tect folloowing condition////
			if (n == squareOfSum)  
			{  
			System.out.println(n+" is a tech number.");  
			}  
			else  
			{  
			System.out.println(n+" is not a tech number.");  
			}  
			}  
			else  
			{  
			System.out.println(n+ " is not a tech number.");  
			}  
			  
		}
	}
}
			  