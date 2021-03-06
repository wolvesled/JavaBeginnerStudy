// Module 7 Mastery Check No.2

// A class for two-dimensional objects.
abstract class TwoDShape {
  private double width;  // these are
  private double height; // now private
  private String name;
  
  // A default constructor.
  TwoDShape() {
    width = height = 0.0;
    name = "null";
  }
  
  // Parameterized constructor.
  TwoDShape(double w, double h, String n) {
    width = w;
    height = h;
    name = n;
  }
  
  // Construct object with equal width and height.
  TwoDShape(double x, String n) {
    width = height = x;
    name = n;
  }
  
  // Construct an object from an object.
  TwoDShape(TwoDShape ob) {
    width = ob.width;
    height = ob.height;
    name = ob.name;
  }
  
  // Accessor methods for width and height.
  double getWidth() { return width; }
  double getHeight() { return height; }
  void setWidth(double w) { width = w; }
  void setHeight(double h) { height = h; }
  
  String getName() { return name; }
  
  void showDim() {
    System.out.println("Width and height are " + width + " and " + height);
  }
  
  // Now, area() is abstract.
  abstract double area();
}

// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
  private String style;
  
  // A default constructor.
  Triangle() {
    super();
    style = "null";
  }
  
  //Constructor
  Triangle(String s, double w, double h) {
    super(w, h, "triangle"); // call superclass constructor
    
    style = s;
  }
  
  // Construct an isoceles triangle.
  Triangle(double x) {
    super(x, "triangle"); // call superclass constructor
    style = "isosceles";
  }
  
  // Construct an object from an object.
  Triangle(Triangle ob) {
    super(ob); // pass object to TwoDShape constructor
    style = ob.style;
  }
  
  // Override area() for Triangle.
  double area () {
    return getWidth() * getHeight() / 2;
  }
  
  void showStyle() {
    System.out.println("Triangle is " + style);
  }
}

// A subclass of TwoDShape for rectangles.
class Rectangle extends TwoDShape {
  // A default constructor.
  Rectangle() {
    super();
  }
  
  // Constructor for Rectangle.
  Rectangle(double w, double h) {
    super(w, h, "rectangle"); // call superclass constructor
  }
  
  // Construct a square.
  Rectangle(double x) {
    super(x, "rectangle"); // call superclass constructor
  }
  
  // Construct an object from an object.
  Rectangle(Rectangle ob) {
    super(ob); // pass object to TwoDShape constructor
  }
  
  boolean isSquare() {
    if(getWidth() == getHeight()) return true;
    return false;
  }
  
  // Override area() for Rectangle.
  double area() {
    return getWidth() * getHeight();
  }
}

class Circle extends TwoDShape {
  // A default constructor.
  Circle() {
    super();
  }
  
  // Constructor for Circle.
  Circle(double d) {
    super(d, "circle"); // call superclass constructor
  }
  
  // Construct and object from an object.
  Circle(Circle ob) {
    super(ob); // pass object to TwoDShape constructor
  }
  
  // Override area() for Circle.
  double area() {
    return getWidth() * getHeight() / 4 * 3.14;
  }
}

class CircleShape {
  public static void main(String args[]) {
    TwoDShape shapes[] = new TwoDShape[6];
    
    shapes[0] = new Triangle("right", 8.0, 12.0);
    shapes[1] = new Rectangle(10);
    shapes[2] = new Circle(15);
    shapes[3] = new Rectangle(10, 4);
    shapes[4] = new Triangle(7.0);
    shapes[5] = new Circle(3);
    
    for(int i=0; i < shapes.length; i++) {
      System.out.println("object is " + shapes[i].getName());
      System.out.println("Area is " + shapes[i].area());
      System.out.println();
    }
  }
}
