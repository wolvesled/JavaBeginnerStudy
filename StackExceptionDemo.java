// Module 9 Mastery Check No.10

// exception for stack full
class StackFullException extends Exception {
  int size;
  
  StackFullException(int s) { size = s; }
  
  public String toString() {
    return "\nStack is full. Maximum size is " + size;
  }
}

// exception for stack empty
class StackEmptyException extends Exception {
  public String toString() {
    return "\nStack is empty.";
  }
}

// A stack class for characters.
class Stack {
	private char stk[]; // this array holds the stack
	private int loc; // the push and pop indices
  
  // Construct an empty Stack given its size.
	Stack(int size) {
		stk = new char[size+1]; // allocate memory for stack
		loc = 0;
	}

	// Construct a Stack from a Stack.
	Stack(Stack ob) {
	  loc = ob.loc;
	  stk = new char[ob.stk.length];

	  // copy elements
	  for(int i=0; i < loc; i++)
	    stk[i] = ob.stk[i];
  }
  
  // Construct a Stack with initial values.
  Stack(char a[]) {
    loc = 0;
    stk = new char[a.length+1];
    
    try {
      for(int i = 0; i < a.length; i++) push(a[i]);
    }
    catch (StackFullException exc) {
      System.out.println(exc);
    }
  }

	// push a character into the stack
	void push(char ch) throws StackFullException {
		if(loc==stk.length-1)
			throw new StackFullException(stk.length-1);
    
		stk[loc++] = ch;
	}

	// pop a character from the stack
	char pop() throws StackEmptyException {
		if(loc == 0)
		  throw new StackEmptyException();

		return stk[--loc];
	}
}

// Demonstrate the Stack class.
class StackExceptionDemo {
	public static void main(String args[]) {
	  // construct 10-element empty stack
	  Stack stk1 = new Stack(10);
    
    char name[] = {'T', 'o', 'm'};
	  // construct stack from array
    Stack stk2 = new Stack(name);

	  char ch;
	  int i;
    
    try {
      // put some characters into stk1
      for(i=0; i < 11; i++)
        stk1.push((char) ('A' + i));
    }
    catch (StackFullException exc) {
      System.out.println(exc);
    }
    
    // construct stack from another stack
    Stack stk3 = new Stack(stk1);
    
    try {
      // Show the stacks.
      System.out.print("Contents of stk1: ");
		  for(i=0; i < 11; i++) {
  			ch = stk1.pop();
			  System.out.print(ch);
		  }
		}
		catch (StackEmptyException exc) {
		  System.out.println(exc);
		}
  
		System.out.println("\n");
    
    try {
		  System.out.print("Contents of stk2: ");
		  for(i=0; i < 4; i++) {
  			ch = stk2.pop();
			  System.out.print(ch);
		  }
		}
		catch (StackEmptyException exc) {
		  System.out.println(exc);
		}
  
		System.out.println("\n");
  
    try {
  		System.out.print("Contents of stk3: ");
		  for(i=0; i < 10; i++) {
  			ch = stk3.pop();
			  System.out.print(ch);
		  }
		}
		catch (StackEmptyException exc) {
		  System.out.println(exc);
	  }
  }
}
