package music;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Program {
	
	private static Scanner sc = new Scanner ( System.in )  ;

	public static void main(String[] args) {
		
		Song[] songs = new Song[5];
		
		for ( int i = 0 ; i < 5 ; i++ ) {
			songs[i] = inputSongDetails() ;
		}
		
		String artist = promptForValue("Please enter an artist name, or just press Return for all artists" );
		
		String res = getQueryDetails(songs, artist) ; 
		
		System.out.println(res);

	}
	
	private static String getQueryDetails(Song[] songs, String artist) {
		String res = "" ;
		for ( Song s : songs ) {
			if ( s.getArtist().equals(artist) || artist.equals("")) {
				res += s.getDetails();
				res += "\n" ;
			}
		}
		return res ;
	}

	private static Song inputSongDetails() {
		
		String name = promptForValue ( "Please enter name of Song : ");
		String artist = promptForValue ( "Please enter name of Artist : ");
		int copiesSold = promptForInt ( "Please enter number of copies sold : ");
		
		return new Song ( name, artist, copiesSold) ;
	}

	private static int promptForInt(String prompt) {
		String val = promptForValue(prompt) ;
		return Integer.parseInt(val);
	}

	private static String promptForValue(String prompt) {
//		System.out.println(prompt);
		return JOptionPane.showInputDialog(prompt);
//		return sc.nextLine() ;
	}

}
