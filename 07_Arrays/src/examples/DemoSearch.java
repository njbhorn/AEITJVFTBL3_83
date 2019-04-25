package examples;

import java.util.Arrays;

public class DemoSearch {

	public static void main(String[] args) {
		int[] votes = { 4, 2, 99, 34, 3 } ;
		
		System.out.println(Arrays.toString(votes));
		
		Arrays.sort(votes); 
		
		System.out.println(Arrays.toString(votes));
				
		System.out.println( Arrays.binarySearch(votes, 1));

	}

}
