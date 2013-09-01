// Module 5 Mastery Check No.3
class Average {
	public static void main(String args[]) {
		double[] d = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 432543542.943257348579328754 };
		double sum = 0;
		
		System.out.print("Average of ");
		for(double di : d) {
			System.out.print(di + " ");
			sum += di;
		}
		
		System.out.println("is: " + sum / d.length);
	}
}
