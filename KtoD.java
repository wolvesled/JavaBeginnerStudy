/* A simple key-to-disk utility that demonstrates a FileWriter. */

import java.io.*;

class KtoD {
	public static void main(String args[]) throws IOException {
		String str;
		FileWriter fw;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			fw = new FileWriter("test.txt");
		}
		catch(IOException exc) {
			System.out.println("Cannot open file.");
			return;
		}
		
		System.out.println("Enter text ('stop' to quit).");
		do {
			System.out.print(": ");
			str = br.readLine();
			
			if(str.compareTo("stop") == 0) break;
			
			str = str + "\r\n"; // add newline
			fw.write(str);
		} while(str.compareTo("stop") != 0);
		
		fw.close();
	}
}
