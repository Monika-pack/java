package first;
import java.util.Scanner;
public class AddSubMulDiv {

	public static void main(String[] args) {
	    int first, second, add, subtract, mul;
	    float devide;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Two Numbers : ");
	    first = sc.nextInt();
	    second = sc.nextInt();

	    add = first + second;
	    subtract = first - second;
	    mul = first * second;
	    devide = (float) first / second;
	    

	    System.out.println("Sum = " + add);
	    System.out.println("Difference = " + subtract);
	    System.out.println("Multiplication = " + mul);
	    System.out.println("Division = " + devide);

	  }
	

	}


