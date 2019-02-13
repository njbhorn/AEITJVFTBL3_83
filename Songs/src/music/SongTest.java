package music;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SongTest {
	
	Song s = new Song ("Title", "Artist", 0) ;

	@Test
	void checkCertificationStandard() {
		s.setCopiesSold(0);
		String actual = s.getCertification() ;
		assertNull(actual);
	}
	
	@Test
	void checkCertificationSilver() {
		s.setCopiesSold(399999);
		String actual = s.getCertification() ;
		String expected = "Silver" ;
		assertEquals(expected, actual);
	}
	
	@Test
	void checkCertificationGold() {
		s.setCopiesSold(599999);
		String actual = s.getCertification() ;
		String expected = "Gold" ;
		assertEquals(expected, actual);
	}
	
	@Test
	void checkCertificationPlatinum() {
		s.setCopiesSold(600000);
		String actual = s.getCertification() ;
		String expected = "Platinum" ;
		assertEquals(expected, actual);
	}

}
