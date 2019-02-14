package demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileRead {

	public static void main(String[] args) throws IOException {

		demoInputStream();

		demoReader();
		
		demoFileDir() ;

	}

	private static void demoFileDir() {
		File d = new File ("C:\\") ;
		
		for ( File f : d.listFiles() ) {
			System.out.println(f.getAbsolutePath());
		}
		
		File newDir = new File ( "c:\\fred") ;
		newDir.mkdir() ;
	}

	private static void demoReader() throws IOException {
		File f = new File ( "resources\\data.txt") ;
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader ( fr ) ;

//		char[] data = new char[70];
//		int num = fr.read(data);
//		System.out.println("Bytes read = " + num);
//		for (char c : data) {
////			System.out.println(c + " = " + (char) c);
//			System.out.println(c + " = " + c);
//		}
		
		String info = null ;
		do {
			info = br.readLine() ;
			System.out.println(info);
		} while ( info != null ) ;

		FileWriter fw = new FileWriter("resources\\newdata.txt");
		BufferedWriter bw = new BufferedWriter(fw) ;
		bw.write("Is it time for a lab yet???");
		bw.close();

	}

	private static void demoInputStream() throws IOException {
		FileInputStream fis = new FileInputStream("resources\\data.txt");

		byte[] data = new byte[70];
		int num = fis.read(data);
		System.out.println("Bytes read = " + num);
		for (byte b : data) {
			System.out.println(b + " = " + (char) b);
		}

		FileOutputStream fos = new FileOutputStream("resources\\newdata.txt");
		fos.write(data);

	}

}
