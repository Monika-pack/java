package capgemini5;
import java.util.Scanner;
public class CiberString {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = in.nextLine();
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i - 1) == ' ') {
                word += Character.toUpperCase(str.charAt(i));
            }
            else {
                word += str.charAt(i);
            }
        }

        System.out.println(word);
    }


	}


