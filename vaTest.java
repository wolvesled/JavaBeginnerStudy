// vaTest() uses a vararg.
static void vaTest(int ... v) {
  System.out.println("Number of args: " + v.length);
  System.out.println("Contents: ");
  
  for(int i=0; i < v.length; i++)
    System.out.println("  arg " + i + ": " + v[i]);
  
  System.out.println();
}
