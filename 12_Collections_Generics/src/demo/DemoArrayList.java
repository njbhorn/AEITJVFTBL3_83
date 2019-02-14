package demo;

import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {

		boolean status ;
		
		ArrayList<String> al = new ArrayList<>() ;
		al.add("Fred") ;
		al.add("Bill") ;
		al.add("Mary") ;
		al.add("Jim") ;
		
		System.out.println(al);
		
		status = al.add("Andy") ;
		System.out.println(status);
		status = al.add("Bill") ;
		System.out.println(status);
		
		System.out.println(al);
		
		
		
		
		for ( Object o : al ) {
//			String s = ( String ) o ;
//			System.out.println(s.toUpperCase());
			System.out.println(o.toString().toUpperCase());
		}
		
	}
	
	
}

class Car {
	int doors = 4 ;
}
