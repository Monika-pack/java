abstract class Animal{
	void sleep() {
		System.out.println("dvdv");
		
	}
	abstract void eat();
}
class Cow extends Animal{
	@Override
	void eat() {
		System.out.println("grace");
		
	}
	void features(){
	System.out.println("cow has own thorns");
}
}
public class AbstractAnimals {

	public static void main(String[] args) {
		Cow ob=new Cow();
		ob.eat();
		ob.sleep();
	}


		

	}


