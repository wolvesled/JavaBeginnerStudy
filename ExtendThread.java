/*
	Project 11-1
	
	Extend Thread.
*/
class MyThread extends Thread {
	int count;
	
	// Construct a new thread.
	MyThread(String name) {
		super(name);
		count = 0;
		start(); // start the thread
	}
	
	// Begin execution of new thread.
	public void run() {
		System.out.println(getName() + " starting.");
		try {
			do {
				Thread.sleep(100);
				System.out.println("In " + getName() + ", count is " + count);
				count++;
			} while(count < 10);
		}
		catch(InterruptedException exc) {
			System.out.println(getName() + " interrupted.");
		}
		System.out.println(getName() + " terminating.");
	}
}

class UseThreadsImproved {
	public static void main(String args[]) {
		System.out.println("Main thread starting.");
		
		MyThread mt = new MyThread("Child #1");
		
		do {
			System.out.print(".");
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException exc) {
				System.out.println("Main thread interrupted.");
			}
		} while (mt.count != 10);
		
		System.out.println("Main thread ending.");
	}
}
