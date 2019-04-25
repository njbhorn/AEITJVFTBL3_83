package examples;

import javax.swing.JOptionPane;

public class DemoEnum {

	public static void main(String[] args) {

		DayOfWeek dow;

		dow = DayOfWeek.FRIDAY;
		
		System.out.println(dow.getAbbr());
		System.out.println(dow.getOrdinal());

		System.out.println(displayDay(dow)) ;
		
		for ( DayOfWeek d : DayOfWeek.values() ) {
			JOptionPane.showMessageDialog(null, "My msg", d.getAbbr(), JOptionPane.INFORMATION_MESSAGE);
		}

	}

	private static String displayDay(DayOfWeek dow) {

		switch ( dow ) {
		case MONDAY :
			return "Monday" ;
		case TUESDAY :
			return "Tuesday" ;
		case WEDNESDAY :
			return "Wednesday" ;
		case THURSDAY :
			return "Thursday" ;
		case FRIDAY :
			return "Friday" ;
		default :
			return "Weekend" ;
		}
		
	}

}
