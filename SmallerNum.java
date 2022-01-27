package first;
import java.util.Scanner;
public class SmallerNum {

	public static void main(String[] args) {
		
			{   
					int a, b, c,d, smallest, temp;  
					Scanner sc = new Scanner(System.in);   
					System.out.println("Enter the first number:");  
					a = sc.nextInt();  
					System.out.println("Enter the second number:");  
					b = sc.nextInt();  
					System.out.println("Enter the third number:");  
					c = sc.nextInt(); 
					d = sc.nextInt(); 
					temp=a<b?a:b;   
					temp=a<c?a:c;
					smallest=d<temp?d:temp;    
					System.out.println("The smallest number is: "+smallest);  
					}  
		}


	}

	


