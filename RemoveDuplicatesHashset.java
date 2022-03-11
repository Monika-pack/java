package programss4;
import java.util.TreeSet;
import java.util.*;
public class RemoveDuplicatesHashset {
                     // tree set makes the program in order//
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		 
        //Adding elements in above object
        // using add() method
        ts.add("Ashwathy");
        ts.add("donalds");
        ts.add("franky");
        ts.add("caargos");
        ts.add("gowtham");
        ts.add("jaackky");
 
        // Now we will be using for each loop in order
        // to iterate through the TreeSet
        for (String value : ts)
 
            // Printing the values inside the object
            System.out.print(value + ", ");
 
        System.out.println();
    }

}
	             // LINKED HASHSET MAKES THE PROGRAM OREDER AND DIS OREDER USER HAV TO MAKE//
	
	