// Create multiple threads.

class MyThread implements Runnable {
	int count;
	Thread thrd;
	
	// Construct a new thread.
	MyThread(String name) {
		thrd = new Thread(this, name);
		count = 0;
		thrd.start(); // start the thread
	}
	
	// Begin execution of new thread.
	public void run() {
		System.out.println(thrd.getName() + " starting.");
		try {
			do {
				Thread.sleep(100);
				System.out.println("In " + thrd.getName() + ", count is " + count);
				count++;
			} while(count < 10);
		}
		catch(InterruptedException exc) {
			System.out.println(thrd.getName() + " interrupted.");
		}
		System.out.println(thrd.getName() + " terminating.");
	}
}

class MoreThreads {
	public static void main(String args[]) {
		System.out.println("Main thread starting.");
		
		MyThread mt1 = new MyThread("Child #1");
		MyThread mt2 = new MyThread("Child #2");
		MyThread mt3 = new MyThread("Child #3");
		
		do {
			System.out.print(".");
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException exc) {
				System.out.println("Main thread interrupted.");
			}
		} while (mt1.count < 10 || mt2.count < 10 || mt3.count < 10);
		
		System.out.println("Main thread ending.");
	}
}
