package demo;

public enum DayOfWeek {
	
	SUNDAY ( 1, "Sun"),
	MONDAY ( 2, "Mon" ),
	TUESDAY (3, "Tue"),
	WEDNESDAY (4, "Wed"),
	THURSDAY (5, "Thu"),
	FRIDAY (6, "Fri"),
	SATURDAY (7, "Sat") ;
	
	private int ordinal ;
	private String abbr ;
	
	DayOfWeek ( int ord, String abbr ) {
		this.ordinal = ord ;
		this.abbr = abbr ;
	}

	public String getAbbr() {
		return abbr;
	}

	public void setAbbr(String abbr) {
		this.abbr = abbr;
	}

	public int getOrdinal() {
		return ordinal;
	}
	
	

}
