// Create a thread by implementing Runnable.

class MyThread implements Runnable {
	int count;
	String thrdName;
	
	MyThread(String name) {
		count = 0;
		thrdName = name;
	}
	
	// Entry point of thread.
	public void run() {
		System.out.println(thrdName + " starting.");
		try {
			do {
				Thread.sleep(100);
				System.out.println("In " + thrdName + ", count is " + count);
				count++;
			} while(count < 10);
		}
		catch(InterruptedException exc) {
			System.out.println(thrdName + " interrupted.");
		}
		System.out.println(thrdName + " terminating.");
	}
}

class UseThreads {
	public static void main(String args[]) {
		System.out.println("Main thread starting.");
		
		// First, construct a MyThread object.
		MyThread mt = new MyThread("Child #1");
		
		// Next, construct a thread from that object.
		Thread newThrd = new Thread(mt);
		
		// Finally, start execution of the thread.
		newThrd.start();
		
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
