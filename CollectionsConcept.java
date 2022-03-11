package collectionstopics;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.*;
public class CollectionsConcept {
	//private static final Iterator iterator = null;
	public static void main(String[] args) {
ArrayList<Float>ob=new ArrayList<>();
 
Scanner sc=new Scanner(System.in);
System.out.println("how many elements in floating value");	 	 
int n=sc.nextInt();
for(int i=0;i<n;i++) {
	System.out.println("enter the elements");
	float val=sc.nextFloat();
	ob .add(val);
}
ArrayList<Float> namelist = null;
//display//
@SuppressWarnings("null")
Iterator it=namelist.iterator();
while(it.hasNext());
System.out.println(it.next());
}
	}
