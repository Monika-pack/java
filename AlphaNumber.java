package string;
import java.util.Scanner;
public class AlphaNumber {

	public static void main(String[] args) {
		//print name m.k.ghandhiji//
		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter a name of words:");
		        String str = sc.nextLine();
		        int len = str.length();

		        System.out.print(str.charAt(0) + " ");
		        for (int i = 1; i < len; i++) {
		            char ch = str.charAt(i);
		            if (ch == ' ') {
		                char ch2 = str.charAt(i + 1);
		                System.out.print(ch2 + " ");
		            }
		        }
		    }
		}

