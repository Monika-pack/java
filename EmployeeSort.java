package programss4;

	import java.io.*;
	import java.util.*;

public class EmployeeSort {

	public static void main(String[] args) {
		
	
	
	class students{

		private int marks;
		private String name;

		// constructor
		public students(int value, String name)
		{
			this.marks=value;
			this.name=name;
		}
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name= name;
		}
		
		public int getMarks()
		{
			return marks;
		}
		
	}

	// Comparator class will override the compare
	// method which will compare the two objects
	// passed in the parameter
	class myMarksComparator implements Comparator<students>
	{

		public int compare(students s1, students s2)
		{
			return s1.getMarks()-s2.getMarks();
		}
	}

	class myNameComparator implements Comparator<students>
	{
		/**
		 *
		 */
		public int compare(students s1, students s2)
		{
			return s1.getName().compareTo(s2.getName());
		}
	}
	}
}