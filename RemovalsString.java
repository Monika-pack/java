package program6;
import java.util.*;
public class RemovalsString {
	private static final Iterator iterator = null;

	public static void main(String[] args) {
		String names[]= {"mohini","vivek","vandana","vivek"};
		ArrayList<String>namelist=new ArrayList<>();
		for(int i=0;i<names.length;i++) {namelist.add(names[i]);}


		for(String s:names) {
			if((namelist.contains(s))) {
				namelist.add(s);
			}
			Iterator it=namelist.iterator();
			System.out.println("After removing duplicate names");
			while(it.hasNext()) {
				
				System.out.println(it.next());
			}
		}
		}
}


	