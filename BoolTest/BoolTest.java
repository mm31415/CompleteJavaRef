/*
  Booleans

  boolean -

    Can only have the value of 'true' or 'false'.  All relational
    operators return a boolean value.  It is the type required by
    the conditional expressions that govern control statements such as
    if and for.

*/

class BoolTest {
  public static void main(String[] args) {
    boolean b;

    b = false;
    System.out.println("b is " + b);
    b = true;
    System.out.println("b is " + b);

    // boolean value can control if statement
    // note you do not need to do (b == true) or (b == false)
    if (b) System.out.println("This is executed.");
    b = false;
    if (b) System.out.println("This is not executed.");

    // relational operators always return a boolean value
    // parentheses are needed because the '+' has higher precendence
    System.out.println("10 > 9 is " + (10 > 9));

    // Note that println() will print "true" or "false"
  }
}
