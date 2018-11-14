/*
  After variables have been declared they can be initialized in two ways:

  Constant Initialization Examples
    int d = 3, e, f = 5; // declares three ints and initializes d and f

  Dynamic Initialization
    Variables can be intiialized using valid expressions at the time
    the variable is declared.
    Expressions can use any valid methods, variables or literals

    See example below
*/

class DynInit {
  public static void main(String[] args) {
    double a = 3.0,  b = 4.0;

    // c is dynamically initialized
    // sqrt() is a built-in method that is a member of the Math class
    double c = Math.sqrt(a * a + b * b);

    System.out.println("Hypotenuse is " + c);
  }
}
