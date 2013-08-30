/*
	Module 3 Mastery Check No.1
	
	Read characters from keyboard until a period is received.
	Have the program count the number of spaces and report the total at the end of the program.
*/
class ReadChar {
	public static void main(String args[]) throws java.io.IOException {
		char ch;
		int s = 0;
		
		do {
			System.out.print("Please input a character followed by ENTER (press ~ to exit): ");
			do {
				ch = (char) System.in.read();
			} while(ch == '\n' | ch == '\r');
			if(ch = ' ') i++;
			System.out.println();
		} while(ch != '~')
		
		System.out.println("Total space key entered " + i + " times.");
	}
}
