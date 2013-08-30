/*
	Module 3 Mastery Check No.10
	
	Reads characters from keyboard and switch character cases from upper to lower and vice versa.
	
	In ASCII the gap between upper case to lower case is 32, e.g. lowercase = uppercase + 32
	
	Make no changes to any other character. Have the program stopp when the user presses period.
	
	At the end. have the program display the number of case changes that have taken place.
*/
class CharCaseSwitch {
	public static void main(String args[]) throws java.io.IOException {
		char ch;
		int i = 0;
		
		do {
			do {
				System.out.print("Please enter a letter for change the case (press ~ to exit): ");
				do {
					ch = (char) System.in.read();
				} while(ch == '\n' | ch == '\r');
			} while(ch < 'a' && ch > 'z' && ch < 'A' && ch > 'Z' && ch != '~');
			
			System.out.println();
			
			if(ch >= 'a' && ch <= 'z') {
				System.out.println("  You have entered lowercase letter: " + ch);
				ch -= 32;
				System.out.println("  Now convert to uppercase letter: " + ch);
				i++;
			} else if(ch >= 'A' && ch <= 'Z') {
				System.out.println("  You have entered uppercase letter: " + ch);
				ch += 32;
				System.out.println("  Now convert to lowercase letter: " + ch);
				i++;
			}
		} while(ch != '~');
		System.out.println("You have terminated the program and complete " + i + " times of case conversions.");
	}
}
