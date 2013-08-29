// Answer to Module 2 Mastery Check No. 10
// Based on algorithm introduced here: http://www.stoimen.com/blog/2012/05/08/computer-algorithms-determine-if-a-number-is-prime/
class PrimalityTest {
	public static void main(String args[]) {
		int count, p;
		bool check = true;
		
		for(p = 2; p <= 100; p++) {
			for(count = p; (count <= (int) Math.sqrt(p)) && check; count++) {
				if(p % count == 0) {
					check = false;
					System.out.println(p + " = " + count + " * " + (p / count) + ", so p is not prime.");
				}
			}
			
			if(check)
				System.out.println(p + " is a prime number!");
		}
	}
}
