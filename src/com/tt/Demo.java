package com.tt;

public class Demo implements Parent1, Friends1 {

	@Override
	public void father() {
		System.out.println("jagan");

	}

	@Override
	public void mother() {
		System.out.println("mani");

	}

	@Override
	public void best() {
		System.out.println("sanju");

	}

	@Override
	public void close() {
		System.out.println("praveen");

	}

	public static void main(String[] args) {
		Demo k = new Demo();
		k.father();
		k.mother();
		k.close();
		k.best();

	}

}
