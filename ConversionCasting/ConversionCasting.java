/*
  Automatic Type Conversion
    1) Types must be compatible.
    2) The desitantion type is larger than the source type.

    When these two conditions a widening conversion takes place.
    For example an int type is always large enough to hold all valid byte
    valuse so no explicit cast statement is required.

    All numeric types including integer and floating-point are compatible
    to one another.

    There are no automatic conversions from numeric to char or boolean.
    char and boolean are also not compatible with one another

    Java however does perform an automatic type coversion when storing a
    literal integer constant into byte, short, long, and char.

  Casting
    This is also known as a narrowing conversion since you are explicitly
    making the value narrower in order to fit the type.

    When dealing with integer types the narrowing will done by reducing the
    source type value by the modulo of the target types range.

    When an floating point type value is assigned to an integer type the
    conversion is called truncation.  This means the fractional component
    of the floating point type is lost.  For example if 1.23 is assigned to
    an integer type the .23 is lost and the value assigneds is 1.
*/
class ConversionCasting {
  public static void main(String[] args) {
    byte b;
    int i = 257;
    double d = 323.142;

    // \n is an escape sequence to create a new line in string literals
    System.out.println("\nConversion of int to byte");
    b = (byte) i; // casting or narrowing conversion
    System.out.println("i and b " + i + " " + b);

    System.out.println("\nConversion of double to int.");
    i = (int) d; // trunction
    System.out.println("d and i " + d + " " + i);

    /*
      This is an intersting conversion.
      First the double is cast into an int (or long in some cases) with truncation.
      Then the resulting int is narrowed to a byte.
    */
    System.out.println("\nConverison of Double to byte.");
    b = (byte) d; // truncation followed by narrowing
    System.out.println("d and b " + d + " " + b);

    int c = 88;
    // char c2 = c; // Error not valid type
    char c2 = (char) c; // works similar to char c2 = 88;
    System.out.println("c and c2 " + c + " "  + c2);
  }
}
