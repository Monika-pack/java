package string;

public class StringPool {

	public static void main(String[] args) {
	//find lenght of string//
		//String.length();
		String s="hello how r u";
		System.out.println("num of characters="+s.length());
		System.out.println("second position"+s.charAt(1));
		System.out.println("last position"+s.charAt(s.length()-2));
		// pgm to find the number of vowels//
		
		int c=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
		if( ch=='a'||  ch=='e'||  ch=='i'||  ch=='o'|| ch=='u')
				c++;
		}

	System.out.println("num of vowels="+c);
}




				
		
		
		
	}


