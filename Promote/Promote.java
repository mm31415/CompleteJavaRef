/*
  Promotion Rules:
    1) All byte, short, and char values are promoted to int.
    2) If one operand is a long the whole expression is promoted to long.
    3) If one operand is float, expression is float.
    4) If one operand is doubble, expression is double.

    Consider the following:

      byte a = 40;
      byte b = 50;
      byte c = 100;
      int d = a * b / c;

    The result of a * b exceeds the range of byte.  Java handles this by
    promoting (converting) a and b to int and then evaluating the expression.
    Variable c will also be converted to int before evaluating the division.

    Although this is beneficial it can sometimes create strange bugs.
    Ex:
      byte b = 50;
      b = b * 2; // Error - cannot assing an int to a byte

    The result of b * 2, or 50 * 2, is a completely valid byte value but
    due to Java promoting b to type int the result is of type int. You
    must explicitly cast the result to a byte.
    Fix:
      byte b = 50;
      b = (byte) (b * 2);

    Note that you have to wrap the expression in parentheses.
      b = (byte) b * 2; // this is wrong
    This is actually doing this:
      b = ( (byte) b ) * 2;
    Meaning that b would still be ending up being promoted to an int
    due to it still being part of an expression.

    The correct way lets the integer multiplication happen first before
    casting the entire result returned to a byte.
*/

class Promote {
  public static void main(String[] args) {
    byte b = 42;
    char c = 'a';
    short s = 1024;
    int i = 50000;
    float f = 5.67f;
    double d = .1234;

    /*
      (f * b): b is promoted to float result of subexpression is float (X)
      (i / c): c is promoted to int, result of subexpression is int (Y)
      (d * s): s is promoted to double, result of sub is double (Z)

      X + Y: Y is promoted to float since X is float, result is float (W)
      W - Z: W is promoted to double since Z is double, result is double
    */
    double result = (f * b) + (i / c) - (d * s);
    System.out.println("Result is " + result);
  }
}
