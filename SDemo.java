// Use a static variable.
class StaticDemo {
  int x; // a normal instance variable
  static int y; // a static variable
}

class SDemo {
  public static void main(String args[]) {
    StaticDemo ob1 = new StaticDemo();
    StaticDemo ob2 = new StaticDemo();
    
    /*
      Each object has its own copy of an instance variable.
    */
    ob1.x = 10;
    ob2.x = 20;
    System.out.println("of course, ob1.x and ob2.x are independent.");
    System.out.println("ob1.x: " + ob1.x + "\nob2.x: " + ob2.x);
    System.out.println();
    
    /*
      Each object shares one copy of a static variable.
    */
    System.out.println("The static variable y is shared.");
    ob1.y = 19;
    System.out.println("ob1.y: " + ob1.y + "\nob2.y: " + ob2.y);
    System.out.println();
    
    System.out.println("The static variable y can be accessed through its class.");
    StaticDemo.y = 11; // Can refer to y through class name
    System.out.println("StaticDemo.y: " + StaticDemo.y + "\nob1.y: " + ob1.y + "\nob2.y: " + ob2.y);
  }
}
