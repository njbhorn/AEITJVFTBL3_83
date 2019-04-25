package Examples;

public class Program {
	
	static boolean summerTime = false;
	static boolean winterTime = false;

	public static void main(String[] args) {
		
		
		if ( !isSummer() || !isWinter() ) {
			System.out.println("THEN Summer = " + isSummer() + " Winter = " + isWinter());
		} else {
			System.out.println("ELSE Summer = " + isSummer() + " Winter = " + isWinter());
		}
	
	}
	
	public static boolean isSummer() {
		return summerTime;
	}

	public static boolean isWinter() {
		return winterTime ;
	}

}
