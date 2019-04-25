package example;

import java.util.Arrays;

public class DemoArray {

	public static void main(String[] args) {

		int [] nums = new int [ 100 ] ;
		
		nums [50 ] = 999 ;
		String [] names = new String [ 999 ] ;
		names[123] = "fred" ;
		
		System.out.println(Arrays.toString(nums));
		
		System.out.println(Arrays.toString(names));

	}

}
