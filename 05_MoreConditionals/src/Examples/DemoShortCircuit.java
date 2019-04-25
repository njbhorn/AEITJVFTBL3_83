package Examples;

public class DemoShortCircuit {
	
	public static void main(String[] args) {
		
		String s = null ;
		
		processString ( s ) ;
		
		System.out.println("Finished...");
		
		
	}

	private static void processString(String s) {

		if ( s != null && s.length() == 8 ) {
			System.out.println("Good word...!");
		}
		
	}

}
