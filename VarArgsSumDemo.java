// Module 6 Mastery Check No.13

class VarArgsSumDemo {
  static int sum(int ... i) {
    int s = 0;
    for(int x : i)
      s += x;
    return s;
  }
  
  public static void main(String args[]) {
    System.out.println(sum(1, 4, 6, 8, 2, 9));
  }
}
