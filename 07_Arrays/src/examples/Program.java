package examples;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		int[] votes = { 4, 1, 99, 34, 2 } ;
		String[] names = {"Tom", "Jaz", "Kash" };
		String[] newNames ;
	
		votes[2] = 66 ;
		
		System.out.println(Arrays.toString(votes));
		
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(votes); 
		
		Arrays.sort(names); 
		
		System.out.println(Arrays.toString(votes));
		
		System.out.println(Arrays.toString(names));
		
		Arrays.fill(names, "Fred");
		
		System.out.println(Arrays.toString(names));
		
		newNames = Arrays.copyOf(names, 6) ;
		
		System.out.println((Arrays.toString(newNames)));
		
		for ( int vote : votes ) {
			System.out.println(vote + " in pos " + Arrays.binarySearch(votes, vote));
		}
		
		
		
		System.out.println(-99 + " in pos " + Arrays.binarySearch(votes, -99));
		System.out.println(99 + " in pos " + Arrays.binarySearch(votes, 99));
		System.out.println(3 + " in pos " + Arrays.binarySearch(votes, 3));
		
		
		
		System.out.println(getPosInArray ( -99, votes )) ;
		System.out.println(getPosInArray ( 99, votes )) ;
		System.out.println(getPosInArray ( 3, votes )) ;
		
	
		

	}

	private static int getPosInArray(int i, int[] votes) {
		return Math.abs(Arrays.binarySearch(votes, i)) - 1;
		
	}

}
