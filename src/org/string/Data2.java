package org.string;

public class Data2 {
	public static void main(String[] args) {
		String w="Kavin";
		String k="Kavin";
		System.out.println("literal string");
		System.out.println(System.identityHashCode(w));
		System.out.println(System.identityHashCode(k));
		String q=new String ("Kavin");
		String a=new String("Kavin");
		System.out.println("non literal string");
		System.out.println(System.identityHashCode(q));
		System.out.println(System.identityHashCode(a));
		
		}

}
