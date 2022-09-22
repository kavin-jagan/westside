package org.basicjava;

public class ClassV {
public ClassV() {
System.out.println("My name is J Kavin");
}
public ClassV(int age) {
	System.out.println("My age is"+age);
}
public static void main(String[] args) {
	ClassV a=new ClassV();
	ClassV b=new ClassV(25);
	
}
}
