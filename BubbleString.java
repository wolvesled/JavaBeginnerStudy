/*
	Module 5 Mastery Check No.4
	
	Modify bubble sort to sort an array of strings by length.
*/

class BubbleString {
	public static void main(String args[]) {
		String strs[] = {
			"A quick brown fox jumps over the lazy dog.",
			"The five boxing wizards jump quickly.",
			"A quick movement of the enemy will jeopardize six gunboats.",
			"Who packed five dozen old quart jugs in my box?",
			"The quick brown fox jumped over the lazy dogs.",
			"Few black taxis drive up major roads on quiet hazy nights.",
			"Pack my box with five dozen liquor jugs.",
			"My girl wove six dozen plaid jackets before she quit.",
			"Pack my red box with five dozen quality jugs."
		};
		int a, b;
		String t;

		// display original array
		System.out.println("Original array is:");
		for(int i=0; i< strs.length; i++)
			System.out.println(" " + strs[i]);
		System.out.println();

		// This is the Bubble sort.
		for(a=1; a < strs.length; a++)
			for(b=strs.length-1; b >= a; b--) {
				if(strs[b-1].length() > strs[b].length()) { // if out of order
					// exchange elements
					t = strs[b-1];
					strs[b-1] = strs[b];
					strs[b] = t;
				}
			}

		// display sorted array
		System.out.println("Sorted array is:");
		for(int i=0; i < strs.length; i++)
			System.out.println(" " + strs[i]);
		System.out.println();
	}
}
