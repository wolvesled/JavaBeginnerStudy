// A simulation of a traffic light that uses an enumeration to describe the light's color.

// An enumeration of the colors of a traffic light.
enum TrafficLightColor {
	RED, GREEN, YELLOW
}

// A computerized traffic light.
class TrafficLightSimulator implements Runnable {
	private Thread thrd; // bolds the thread that runs the simulation
	private TrafficLightColor tlc; // holds the current traffic light color
	boolean stop = false; // set to true to stop the simulation
	
	TrafficLightSimulator(TrafficLightColor init) {
		tlc = init;
		
		thrd = new Thread(this);
		thrd.start();
	}
	
	TrafficLightSimulator() {
		tlc = TrafficLightColor.RED;
		
		thrd = new Thread(this);
		thrd.start();
	}
	
	// Start up the light.
	public void run() {
		while(!stop) {
			try {
				switch(tlc) {
					case GREEN:
						Thread.sleep(100); // green for 0.1 seconds
						break;
					case YELLOW:
						Thread.sleep(20); // yellow for 0.02 seconds
						break;
					case RED:
						Thread.sleep(120); // red for 0.12 seconds
						break;
				}
			} catch(InterruptedException exc) {
				System.out.println(exc);
			}
			changeColor();
		}
	}
	
	// Change color.
	synchronized void changeColor() {
		switch(tlc) {
			case RED:
				tlc = TrafficLightColor.GREEN;
				break;
			case YELLOW:
				tlc = TrafficLightColor.RED;
				break;
			case GREEN:
				tlc = TrafficLightColor.YELLOW;
		}
		
		notify(); // signal that the light has changed
	}
	
	// Wait until a light change occurs.
	synchronized void waitForChange() {
		try {
			wait(); // wait for light to change
		} catch(InterruptedException exc) {
			System.out.println(exc);
		}
	}
	
	// Return current color.
	TrafficLightColor getColor() {
		return tlc;
	}
	
	// Stop the traffic light.
	void cancel() {
		stop = true;
	}
}

class TrafficLightDemo {
	public static void main(String args[]) {
		TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);
		
		for(int i=0; i < 9; i++) {
			System.out.println(t1.getColor());
			t1.waitForChange();
		}
		t1.cancel();
	}
}
