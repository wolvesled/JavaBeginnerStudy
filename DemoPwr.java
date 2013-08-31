class Pwr {
	double b;
	int e;
	double val;
	
	Pwr(double base, int exp) {
		b = base;
		// this.b = base;
		e = exp;
		// this.e = exp;
		
		val = 1;
		// this.val = 1;
		if(exp==0) return;
		for( ; exp>0; exp--) val = val * base;
		// for( ; exp>0; exp--) this.val = this.val * base;
	}
	
/*
	Pwr(double b, int e) {
		this.b = b;
		this.e = e;
		
		val = 1;
		if(e==0) return;
		for( ; e>0; e--) val = val * b;
	}
*/
	
	double get_pwr() {
		return val;
		// return this.val;
	}
}

class DemoPwr {
	public static void main(String args[]) {
		Pwr x = new Pwr(4.0, 2);
		Pwr y = new Pwr(2.5, 1);
		Pwr z = new Pwr(5.7, 0);
		
		System.out.println(x.b + " raised to the " + x.e + " power is " + x.get_pwr());
		System.out.println(y.b + " raised to the " + y.e + " power is " + y.get_pwr());
		System.out.println(z.b + " raised to the " + z.e + " power is " + z.get_pwr());
	}
}
