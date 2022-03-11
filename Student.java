package constructor_injection;

public class Student {
private String name;
private int id;
public Student(String name,int id) {
	super();
	this.name=name;
	this.id = id;
}
void display() {
	System.out.println("id=" +id);
	System.out.println("name=" +name);
}
}
