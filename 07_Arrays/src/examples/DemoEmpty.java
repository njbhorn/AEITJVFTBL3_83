package examples;

public class DemoEmpty {

	public static void main(String[] args) {
		int [] nums = new int [ 10 ] ;
		String[] names = new String [ 99 ] ;
		
		names [ 50 ] = "fred" ;
		
//		for ( int i = 0 ; i < nums.length ; i++ ) {
//			nums [ i ] = i * 2 ;
//			names [ i ] = Integer.toString(i * 2) ;
//			System.out.println(nums[i]);
//		}
		
		for ( int num : nums ) {
			num = 99 ;
			System.out.println(num);
		}
		
		for ( String name : names ) {
//			name = "fred" ;
			System.out.println(name);
		}
	}

}
