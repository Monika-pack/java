
import java.util.Stack;
public class StackDemo {
//push,pop,peek,search,empty/
	public static void main(String[] args) {
		Stack<String> st=new Stack<>();
		st.push("one");
		st.push("two");
		st.push("three");
		st.push("four");
		st.push("five");
		st.push("six");
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.peek());//three//
		System.out.println(st);
		System.out.println(st.search("one"));
		int i=st.search("one");
		System.out.println(st.get(1));
		st.clear();
		System.out.println(st.empty());
		System.out.println(st.pop());
	
			
		
		
	}

}
