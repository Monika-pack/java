package first;                  //***********first concept************//
public class ConstructorHowWhen {
	  private String name;

	  // constructor//
	 ConstructorHowWhen() {
	    System.out.println("Constructor Called:");
	    name = "Programiz";
	  }
 public static void main(String[] args) {

	    // constructor is invoked while creating an object of the Main class//
 ConstructorHowWhen obj = new  ConstructorHowWhen(); //creating object for constructor//
 System.out.println("The name is " + obj.name);
	  }
}                             //*********** second concept*************//
class Main {

	  int i;

	  // constructor with no parameter//
	  private Main() {
	    i = 5;
	    System.out.println("Constructor is called");
	  }

	  public static void main(String[] args) {

	    // calling the constructor without any parameter//
	    Main obj = new Main();
	    System.out.println("Value of i: " + obj.i);
	  }
	}
class Company {
	  String name;

	  // public constructor
	  public Company() {
	    name = "Programiz";
	  }
	}
                                   //********third concept********************//
	class ConstructorHowWhen2 {
	  public static void main(String[] args) {

	    // object is created in another class//
	    Company obj = new Company();
	    System.out.println("Company name = " + obj.name);
	  }
	}                              //********fourth concept********************//     
	class ConstructorHowWhen3 {

		  String languages;

		  // constructor accepting single value
		  ConstructorHowWhen3 (String lang) {
		    languages = lang;
		    System.out.println(languages + " Programming Language");
		  }

		  public static void main(String[] args) {

		    // call constructor by passing a single value
			  ConstructorHowWhen3  obj1 = new ConstructorHowWhen3("Java");
			  ConstructorHowWhen3 obj2 = new ConstructorHowWhen3("Python");
			  ConstructorHowWhen3 obj3 = new ConstructorHowWhen3("C");
		  }
		}
	class ConstructorHowWhen4 {

		  int a;//integer consists 0 default values//
		  boolean b;//boolean consists false values//

		  public static void main(String[] args) {

		    //constructor provide no arguments with default values is called  a default constructor //  
			  ConstructorHowWhen4 obj = new ConstructorHowWhen4 ();

		    System.out.println("Default Value:");
		    System.out.println("a = " + obj.a);
		    System.out.println("b = " + obj.b);
		  }
		}

