/*
  Primitive type Group I: Integers

  Java has four integer types that are all signed positive or negative values.

  byte -
    Width: 8bits, Range: -128 to 127
    Uses: working with stream of data from a network or file, working With
    raw inary data that may not e compatile with Java's other built-in types

  short -
    Width: 16bits, Range: -32,768 to 32,767
    Least used Java type

  Note:  Although it may be tempting to substitute byte or short in
  place of int for hopes of efficiency, it is not the case due to byte and
  short being type promoted to int when used in an expression and the
  expression is evaluated

  int -
    Width: 32bits, Range: -2,147,483,648 to 2,147,483,647
    Most commonly used Integer type, some uses include indexing into
    arrays or controlling loops

  long =
    Width: 64bits, Range: ~ -9.2*10^18 to 9.2*10^18
    Useful for occasions when an int type is not large enough to hold
    the desired value

  Due to Java's portability it should be noted that all data types have
  a strictly defined range and width unlike C and C++.  Although this may
  cause a small loss of performance in some environments the guarantee of
  program running without the need for porting outweighs that loss.
*/

class Light {
  public static void main(String[] args) {
    int lightspeed;
    long days;
    long seconds;
    long distance;
    int distance2;

    // apprx speed of light in miles per second
    lightspeed = 186000;

    days = 1000; // specify number of days here

    seconds = days * 24 * 60 * 60; // convert to seconnds

    distance = lightspeed * seconds;  // compute distance
    distance2 = (int) (lightspeed * seconds); // coerce the long value into int

    System.out.print("In " + days);
    System.out.print(" days light will travel about ");
    System.out.println(distance + " miles.");

    // Note the program compiles but the result is incorrect
    System.out.println(distance2 + " miles.");

    /*
      The reason the program compiles but returns an incorrect result is
      due to integer overflow.  Java just stores the value by cycling
      through the range of the data type as many times needed to store
      the value.  Think of it as some form of the modulo operator.

      See the example below where one is added/subtracted from the min
      and max values of the int type range.
    */
    long num1 = 2_147_483_647L;
    long num2 = 1L;
    int num3 = (int) (num1 + num2);

    long num4 = -2_147_483_648L;
    int num5 = (int) (num4 - num2);

    System.out.println(num1 + " + " + num2 + " = " + num3);
    System.out.println(num4 + " - " + num2 + " = " + num5);
  }
}
