package first;

public class NullPointer {

	public static void main(String[] args) {
		String s=null;
		System.out.println("before length");
		//number format exception//
		String num="ghj";
		int n=Integer.parseInt(num);
		try {
			int l=s.length();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("after length");
		
		}
	}


