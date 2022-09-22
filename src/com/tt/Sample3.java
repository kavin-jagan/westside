package com.tt;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Sample3 {
	
	
	public static void main(String[] args) {
		Map<Integer, String>mp=new LinkedHashMap<>();
		
		
		mp.put(10, "java");
		mp.put(20, "oracle");
		
		System.out.println(mp);
		
		
		Set<Entry<Integer,String>> en = mp.entrySet();
		
		for (Entry<Integer, String> x : en) {
			
			System.out.println(x);
			
		}
		
		for (Entry<Integer, String> x : en) {
			
			System.out.println(x.getKey());
			
		}
		for (Entry<Integer, String> x : en) {
			System.out.println(x.getValue());
			
		}
		
		
		for (Entry<Integer, String> x : en) {
			
			System.out.println(x.getKey());
			System.out.println(x.getValue());
		}
		
	}

}




