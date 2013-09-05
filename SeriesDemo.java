public interface Series {
  int getNext(); // return next number in series
  void reset(); // restart
  void setStart(int x); // set starting value
}

// Implement Series.
class ByTwos implements Series {
  int start;
  int val;
  
  ByTwos() {
    start = 0;
    val = 0;
  }
  
  public int getNext() {
    val += 2;
    return val;
  }
  
  public void reset() {
    start = 0;
    val = 0;
  }
  
  public void setStart(int x) {
    start = x;
    val = x;
  }
}

class SeriesDemo {
  public static void main(String args[]) {
    ByTwos ob = new ByTwos();
    
    for(int i=0; i < 5; i++)
      System.out.println("Next value is " + ob.getNext());
    
    System.out.println("\nResetting");
    ob.reset();
    for(int i=0; i < 5; i++)
      System.out.println("Next value is " + ob.getNext());
    
    System.out.println("\nStarting at 100");
    ob.setStart(100);
    for(int i=0; i < 5; i++)
      System.out.println("Next value is " + ob.getNext());
  }
}
