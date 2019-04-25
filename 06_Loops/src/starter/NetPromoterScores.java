package starter;

public class NetPromoterScores {
	// change these to produce different NPScore
	// initially supplied as 7 promoters 2 detractors 1 passive: % score =
	// (7-2)/10*100 = 50%
	static String courseScores = "3,x,10,7,4,9,10,9,9,10";
	
	public static void main(String[] args) {
		// declare whatever variables you need

        // use method GetNextScore
		
		double npScore; // do calculation here and then uncomment next line
		//System.out.printf("Net Promoter Score is %.2f", npScore);

	}
	
	
	// Stuff you don't need to write but which contains Boolean GetNextScore()
	/**
	 * returns the next score from the list or -1 if there is a problem
	 * @return int
	 */
	static int getNextScore() {
		
		int score = -1; // set the return value to false (i.e. some problem)
		if (firstRequestForScore) {
			if (courseScores == "") {
				System.out.printf("No scores supplied!");

			}
			scores = courseScores.split(",");
			firstRequestForScore = false;
		}
		// Are we about to go outside bounds?
		if (count >= scores.length)
			return -1;
		// Inbounds still - check numeric and 0-10
		String value = scores[count++];
		if (!tryParse(value)) {
			System.out.println("Each score must be numeric in the range 0 - 10!");
			// Environment.Exit(0);
		} else {
			score = Integer.parseInt(value);
			if (score < 0 || score > 10) {
				System.out.println("Each score must be numeric in the range 0 - 10!");
			}
		}
		return score;

	}

	private static Boolean tryParse(String value) {
		try {
			Double.parseDouble(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	static Boolean firstRequestForScore = true;
	static String[] scores;
	static int count;}
