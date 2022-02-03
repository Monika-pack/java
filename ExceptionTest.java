package first;
import java.util.Scanner;
public class ExceptionTest {

	public static void main(String[] args) {
		{
	        // Declaring an variable //
	        
	        int number;
	 
	        
	        Scanner sc = new Scanner(System.in);
	 
	       //while condition is used untill the user gives crt integer//
	        while (true) {
	 
	            // Display message//
	            System.out.println("Enter any valid Integer: ");
	 
	            // Try block to check if any exception occurs//
	            try {
	 
	                // Parsing user input to integer//
	                // using the parseInt() method//
	                number = Integer.parseInt(sc.next());
	 
	                // Number can be valid or invalid
	 
	                // If number is valid, print and display
	                // the message and number
	                System.out.println("You entered: "
	                                   + number);
	 
	                // Get off from this loop//
	                break;
	            }
	 
	            // Catch block to handle NumberFormatException//
	            catch (NumberFormatException e) {
	 
	                // Print the message if exception occured//
	                System.out.println(
	                    "NumberFormatException occured");
	            }
	        }
	    }
	}
	 
	}


