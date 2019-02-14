package demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DemoNewFileIO {

	public static void main(String[] args) throws IOException {

		Path p = Paths.get("src\\solution\\FileWithLinesIn.txt") ;
		Path p2 = Paths.get("src\\solution\\demo.txt") ;
		
		List<String> lines = Files.readAllLines(p) ;
		
		for ( String line : lines ) {
			System.out.println(line);
		}
		
		Files.write(p2, lines) ;

	}

}
