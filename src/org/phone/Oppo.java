package org.phone;

public class Oppo {
	private void phoneInfo() {
		System.out.println("Phone details are");
	}
	private void phoneInfo(int year) {
	System.out.println("The phone released year is"+year);
	}
	private void phoneInfo(int price,String comName) {
		System.out.println("The Phone price is"+price);
		System.out.println("The company name is"+comName);
	}
	private void phoneInfo(String modName,int modelNumber) {
		System.out.println("The model number is"+modelNumber);
		System.out.println("Tne model name is"+modName);
	}
public static void main(String[] args) {
	Oppo o=new Oppo();
	o.phoneInfo();
	o.phoneInfo(2022);
	o.phoneInfo(24000, "Oppo");
	o.phoneInfo("Fseries",11);
	
}
}
	
	
	

	


