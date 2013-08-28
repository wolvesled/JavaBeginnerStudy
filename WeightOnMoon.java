/*
	Answer for Module 1 Mastery Check No.9
	
	The moon's gravity is about 17 percent that of earch's. Write a program that computes your effective weight on the moon.
*/
class WeightOnMoon {
	public static void main(String args[]) {
		double weightOnEarth, weightOnMoon;
		
		weightOnEarth = 80; // my weight on earth for example 80kg.
		System.out.println("My weight on earth is " + weightOnEarth + "kg.");
		
		weightOnMoon = weightOnEarth * 0.17 // moon's gravity is about 17 percent that of earth's.
		System.out.println("my weight on moon would be " + weightOnMoon + "kg.");
	}
}
