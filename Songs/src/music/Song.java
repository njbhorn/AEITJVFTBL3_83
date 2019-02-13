package music;

public class Song {

	private String name;
	private String artist;
	private int copiesSold;

	public Song(String name, String artist, int copiesSold) {
		super();
		this.name = name;
		this.artist = artist;
		this.copiesSold = copiesSold;
	}

	public String getDetails() {
		return "Name: " + name + " Artist: " + artist + " Copies Sold: " + copiesSold + "]";
	}

	public String getCertification() {
		String retVal = null ;
			if ( copiesSold < 200000 ) {
				return null ;
			}
			if ( copiesSold < 400000 ) {
				return "Silver" ;
			}
			if ( copiesSold < 600000 ) {
				return "Gold" ;
			}
			if ( copiesSold >= 600000 ) {
				return "Platinum" ;
			}
			return retVal ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getCopiesSold() {
		return copiesSold;
	}

	public void setCopiesSold(int copiesSold) {
		this.copiesSold = copiesSold;
	}

	@Override
	public String toString() {
		return "Song [name=" + name + ", artist=" + artist + ", copiesSold=" + copiesSold ;
	}

}
