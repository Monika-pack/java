package programss4;


import java.util.HashMap;
import java.util.Map;
public class HashMapDEmo {


	
	public static void main(String[] args) 
		{
		
			   HashMap<Long, String> hm=new HashMap<Long,String>();
			 
			   hm.put(9600082195l,"abhishek");
			 
			   hm.put(967882195l,"anusha");
			 
			   hm.put(96897082196l,"ajith");
			 
			   hm.put(9689082195l,"aparna");
			 
			   hm.put(968962193l,"alekhya");
			 
			   for(Map.Entry m:hm.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }

		}
	
			   
			    
		}

	

	


