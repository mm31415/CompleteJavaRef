/*
  Many programming languages define scope as global or local.
  These two distinctions do not fit with Java's strict object orientated
  model.  In Java the two major scopes are those defined by a class and
  those defined by a method.  Class scope has some unique characteristics
  that will be later covered.

  Method Scope
    The scope of a method is started at the opening curly brace and ends
    at the matching closing curly brace.  Method parameters are also included
    in the scope of a method.

    A variable is only accessible after it has been declared.  Meaning
    if any variables are declared at the end of a method or block they
    are useless to the scope.

    Nested scopes can be created within the method scope through the use
    of curly braces to create blocks.

    Although scopes can be nested one cannot declare a variable with
    the same name as the outer scope.

    ex:
    if (true) {
      int var = 2;
      if (var == 2) {
        int var = 3; // Compile-time error - var already defined
      }
    }
*/

class Scope {
  public static void main(String[] args) {
    int x = 10;

    if (x == 10) {
      int y = 20; // known only to this block

      // x and y are both known here
      System.out.println("x and y: " + x + " " + y);
      x = y * 2;
    }
    // y = 100; // Error, y is not known here

    // x is still known here
    System.out.println("x is: " + x);

    int a;

    for ( a = 0; a < 3; a++) {
      int b = -1; // b is initialized and declared each time the block is entered
      System.out.println("b is: " + b);
      b = 100;
      System.out.println("b is now: " + b);
    } // b is destroyed

    // a variable is only accessible after it has been declared
    // System.out.println("z is: " + z); // Error z is not declared
    // int z = 100;
  }
}
