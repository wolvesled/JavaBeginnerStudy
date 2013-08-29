// Demonstrate the switch without break statements.
class NoBreak {
	public static void main(String args[]) {
		int i;
		
		for(i = 0; i <= 5; i++) {
			switch(i) {
				case 0:
					System.out.println("i is zero");
				case 1:
					System.out.println("i is one");
				case 2:
					System.out.println("i is two");
				case 3:
					System.out.println("i is three");
				case 4:
				  System.out.println("i is four");
				case 5:
				  System.out.println("i is five");
			}
			System.out.println();
		}
	}
}
