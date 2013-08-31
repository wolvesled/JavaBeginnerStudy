// A simple constructor.

class MyClass {
	int x;
	
	MyClass {
		x = 10;
	}
}

class ConsDemo {
	public static void main(String args[]) {
		MyClass t1 = new MyClass();
		myClass t2 = new MyClass();
		
		System.out.println(t1.x + " " + t2.x);
	}
}
