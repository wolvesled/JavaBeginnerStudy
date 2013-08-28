/*
	Answer for Module 1 Mastery Check No.10
	
	Adapt Project 1-2 so that it prints a conversion table of inches to meters. Display 12 feet of conversion, inch by inch. OUtput a blank line every 12 inches. (One meter equals approximately 39.37 inches.)
*/
class InchToMeterTable {
	public static void main(String args[]) {
		int feet, inch, totalInche;
		double meter;
		
		for(feet = 0; feet <= 12; feet++) {
			for(inch = 0; inch <= 11; inch++) {
				totalInche = feet * 12 + inch // one feet is 12 inches, calculate total inches iterated so far.
				meter = totalInche / 39.37 // one meter equals approximately 39.37 inches.
				System.out.println(totalInch + " inches approximately equal to " + meter + " meters.");
			}
			System.out.println();
		}
	}
}
