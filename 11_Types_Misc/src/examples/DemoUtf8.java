package examples;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class DemoUtf8 {

	public static void main(String[] args) {
		
		try {
			OutputStreamWriter writer =
			         new OutputStreamWriter(
			        		 new FileOutputStream("demo.txt")
			        		 			, StandardCharsets.UTF_8) ;
			for (int i = 0; i <= 65535; i++) {
				char unicode = (char) i;
				
				String toWrite = String.format("%d\t%4s\t%s\n"
						, i
						, Integer.toHexString(i)
						, unicode
						);
//				String toWrite = i + "\t" + Integer.toHexString(i) 
//									+ "\t" + unicode + "\n" ;
//				writer.append(i);
//				writer.append('\t') ;
//				writer.append(unicode);
//				writer.append('\n');
				writer.write(toWrite);
			}
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		String s = "A\t\nB" ;
		s.codePoints().forEach(System.out::println);
		
//		String s = "\u0F73" ;
//		s.codePoints().forEach((char)System.out::println);
		System.out.println( );
		
		int x = 3 ;
		int y = 2 ;
//		System.out.println(Integer.toBinaryString(x));
//		System.out.println(Integer.toBinaryString(y));
//		System.out.println( x | y); 
//		System.out.println( Integer.toBinaryString(x ^ y));
//		System.out.println( x | y); 
//		System.out.println( x ^ y); 
		
		
		
//		int x = 65 ;
//		x++ ;
//		
//		char c = 'A' ;
//		char b = '\u0042' ;
//		c++ ;
//		
//		System.out.println(b);
//		System.out.println((char)x);
//		System.out.println((int)c);
//		
		
//		byte lmax = Byte.MAX_VALUE ;
//		
//		System.out.println(lmax);
//		lmax ++ ;
//		
//		System.out.println(lmax);
		
		
//		byte lmin = Byte.MIN_VALUE ;
//		System.out.println(Byte.MAX_VALUE);
		
//		System.out.println(Integer.toBinaryString(lmax));
//		System.out.println(Integer.toHexString(lmax));
//		System.out.println(Byte.MIN_VALUE);
//		System.out.println(Integer.toBinaryString(lmin));
//		System.out.println(Integer.toHexString(lmin));
		
		
		
		
		
		
		
		
//		int x = 10 ;
//		
//		System.out.println(Integer.toBinaryString(x));
//		System.out.println(Integer.toHexString(x));
//		
//		Scanner sc = new Scanner ( System.in ) ;
//		
//		System.out.println("Enter a number :");
//		
//		String val = sc.nextLine() ;
//		
//		x = Integer.parseInt(val) ;
//		
//		System.out.println(Integer.toBinaryString(x));
//		
//		int y = 99 ;
//		Integer z = y ;
//		
//		System.out.println(y);
//		System.out.println(z);
//		
		
		
		
		
//		demo ( "abc", "def", "ghi" ) ;
//		demo ( "abc", "def" ) ;
//		demo ( 99, "abc", "def", "ghi","jkl","mno","pqr" ) ;
	
	}
	
	private static void demo( int x , String... vals) {
		
		for ( String s : vals ) {
			System.out.println(s);
		
	}
		
//		StringBuilder sb = new StringBuilder ( "Fred") ;
//		
//		for ( int i = 0 ; i < 10 ; i++ ) {
//			sb.append("a") ;
//		}
//		
//		System.out.println(sb);
//		
//		sb.replace( 5,7, "z") ;
//		
//		System.out.println(sb);
//		
//		sb.insert ( 8, "xx") ;
//		
//		System.out.println(sb);
		
//		String s = "this is a long sentence ready for a break I need a coffee" ;
//		String s2 = "127.1.12.13" ;
//		
//		String [] words = s2.split(".") ;
//		
//		for ( String word : words ) {
//			System.out.println(word);
//		}
		
		
//		String s1 = "Frederica" ;
//		
//		System.out.println(s1.substring(2,4));
//		
//		System.out.println(s1.substring(0, s1.length() -1  )); 
		
		
		
		
		
		
		
		
//		String s = "fred" ;
//		String s2 = new String ( "fred" ) ;
//		
//		String s3 = "fred" ;
//		
////		String s4 = new String ( "bill") ;
//		
//		System.out.println(s.equals(s3));
//		System.out.println(s == s3 );
//		System.out.println(s.equals(s2));
//		System.out.println(s == s2 );
//		
//		s3 = "freddy" ;
//		
//		System.out.println(s.equals(s3));
//		System.out.println(s == s3 );
//		
//		s3 = "fred" ;
//		
//		System.out.println(s.equals(s3));
//		System.out.println(s == s3 );
//		
//		String demo = "" ;
//		
//		for ( int i = 0 ; i < 10 ; i++ ) {
//			demo += "a" ;
//			System.out.println(demo);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	

}

