package org.typesofvariable;

public class Variable {
	public static int a=18;

	public static void local() {
		
		a++;
		System.out.println(a);
				
	}
	public static void local2() {
		a--;
		System.out.println(a);

}
	public static void main(String[] args) {
	
	Variable v=new Variable();
	v.local();
	v.local2();
	}
}