package string;
import java.util.Scanner;
public class RemoveVowels {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Enter a word or sentence:");
        String str = in.nextLine();
        
        int len = str.length();
        String newStr = "";

        for (int i = 0; i < len; i++) {
            
            char ch = Character.toUpperCase(str.charAt(i));
            
            if (ch == 'A' ||
            ch == 'E' ||
            ch == 'I' ||
            ch == 'O' ||
            ch == 'U') {
                
                newStr = newStr + '*';
            }
            else {
                newStr = newStr + ch;
            }
            
        }
        
        System.out.println(newStr);
    }
}



