package chainning;

public class PersonA {
	public PersonA() {
		this("Kavin");
		
		System.out.println("Default constructor");
	}
public PersonA(int age) {
	
	System.out.println("person age is"+age);
}
public PersonA(String name) {
	this("Oppo",638009);
	System.out.println("person name is"+name);
	
}
public PersonA(String comName,int pincode) {
	this(25);
	System.out.println("person pincode is"+pincode);
	System.out.println("person company name is"+comName);
	
}
public static void main(String[] args) {
	PersonA z=new PersonA();
	
}
}
