package overridepackage;

class Overridemain {
            int id;
		    static  String cname="Microsoft";
			public static  void display() { 
				//System.out.println(" Parent class display function "+id);//error
				System.out.println("static method can access only static data "+cname);
			}
			void non_static_mathod() {
				 System.out.println(" Parent class display function "+id);
				System.out.println("static method can access only static data "+cname);
			}
		}

		class child extends OverRide{
			int k;
			/*public  void display() { //static method cannot be overriden
			 //static method are inheritated you can use it with ref to class or object
				
				System.out.println("child class display function");
				
			}*/
			void child_function() {
				System.out.println("child_function");
			}
		}
		public class OverRide{
			public static void main(String[] args) {
				Overridemain ob = new Overridemain();
				Overridemain.display();
				ob.display();
			
				OverRide cob = new OverRide();
				
				
				}
		}

	


