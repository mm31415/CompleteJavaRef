/*
  Floating-Point Types

  Used to store real numbers for evaluating expressions that require
  fractional precision.

  float -
    Width:  32bits, Range: ~ 1.4e-045 to 3.4e+038
    A float is a single-precision value.  Single precision is faster on
    some processors and takes half as much space as a double precision.
    The trade-off is that they become imprecise when the values are either
    very large or small.
    This type is usually useful for representing data as a fractional
    component but do not need a large degree of precision, such as
    representing dollars and cents.

  double -
    Width: 64its, Range: ~ 4.9e-324 to 1.8e+308
    Double precision can actually be faster than single precision on
    some modern processors that have been optimized for high-speed
    mathematical calculations.  All the transcendental math functions
    such as sin(), cos(), and sqrt() return double values.
    Use double when needing to maintain accuracy over many iterative
    calculations or manipulating large valued numbbers.
*/

class Area {
  public static void main(String[] args) {
    double pi, r, a;

    r = 10.8; // radius of circle
    pi = 3.1416; // pi, approx
    a = pi * r * r; //compute area

    System.out.println("Double Area of circle is " + a);

    float pi2, r2, a2;

    r2 = 10.8f; // radius of circle
    pi2 = 3.1416f; // pi, approx
    a2 = pi2 * r2 * r2; //compute area

    System.out.println("Float Area of circle is " + a2);

    /*
      366.436224 vs 366.43622
      Note that the double result is slightly more precise than the
      float result.

      Although this may not be not seem like much in this example it can
      quickly compound over multiple iterations or calculations
      causing the end results to begin to drift apart quickly.

      The example below shows how the differences begin to matter if
      one needs precise calculations.
    */

    a = 1.0d;
    a2 = 1.0f;

    for (int i = 0; i <= 100; i++) {
      a *= 1.055d;
      a2 *= 1.055f;
    }

    System.out.println("Double is " + a);
    System.out.println("Float is " + a2);
  }
}
