package game;

import java.util.HashSet;
import java.util.Set;

public class JavaClass {

	public static void main(String[] args) {
		
		Set si = new HashSet();
		si.add("Shiva");
		si.add('M');
		si.add(25);
		si.add('M');
		
		
		System.out.println(si.size());
		
		System.out.println(si.contains(25));
		
		si.remove("Shiva");
		
		for (Object object : si) {
			
			System.out.println(object);
		}
	}
}

