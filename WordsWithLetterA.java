package capgemini2;
import java.util.Scanner;
public class WordsWithLetterA {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String str = in.nextLine();
	        str = " " + str; 
	        int c = 0;
	        int len = str.length();
	        str = str.toUpperCase();
	        for (int i = 0; i < len - 1; i++) {
	            if (str.charAt(i) == ' ' && str.charAt(i + 1) == 'A')
	                c++;
	        }
	        System.out.println("Total number of words starting with letter 'A' = " + c);
	    }
	


	}


