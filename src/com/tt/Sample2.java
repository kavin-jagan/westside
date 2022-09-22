package com.tt;

import java.util.HashSet;
import java.util.Set;

public class Sample2 {
	
	public static void main(String[] args) {
		
		Set<Integer>li=new HashSet<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(20);
		
		
		System.out.println("Iterate set");
		
		
		for (Integer x : li) {
			System.out.println(x);
			
		}
		
		
		
		
		
	}

}
