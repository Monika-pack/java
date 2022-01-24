package string;
import java.util.Scanner;
public class AcceptSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       System.out.println("Enter a sentence:");
	       String str = sc.nextLine();
	       str = " " + str;
	       String word = "";
	       int len = str.length();
	       
	       for (int i = len - 1; i >= 0; i--) {
	           char ch = str.charAt(i);
	           if (ch == ' ') {
	               System.out.print(word + " ");
	               word = "";
	           }
	           else {
	        	   word = ch + word;
	           }
	       }
	   }
	

	}


