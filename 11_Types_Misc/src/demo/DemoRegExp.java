package demo;

public class DemoRegExp {

	public static void main(String[] args) {

		String s = "Mississippi" ;
		String s2 = s.replaceAll ( "[sp]{2}", "x" ) ;
		
		
		
		System.out.println(s);
		System.out.println(s2);

	}

}
