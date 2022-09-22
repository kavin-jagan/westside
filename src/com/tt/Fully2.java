package com.tt;

public class Fully2 implements Fully {

	@Override
	public void time() {
		System.out.println("time is night 7");
		
	}

	@Override
	public void coach() {
		System.out.println("coach name is lee");
		
	}
	
	
	public static void main(String[] args) {
		Fully2 n=new Fully2();
		n.coach();
		n.time();
		
		
	}

	
	
	
	
}
