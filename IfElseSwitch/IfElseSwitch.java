/*
  IfElse and Switch Control Statements

  Control statements in java cause the flow of execution to advance
  and branch on changes to the state of a program.  Java's program control
  statements can be grouped into: selection, iteration, and jump.

  IfElse and Switch are selection statements.  They allow a program to
  choose different paths of execution based upon the outcome of an
  expression or the state of a variable during runtime.

  IfElse and Switch statements are similar but these are the differences:

    1) IfElse is executed from the top down.  Switch statements are handled
    differently.  The compiler creates a "jump table" based on the cases
    so during runtime the value of the data will only select the correct jump
    rather than having to step through pontentiallly all steps like the
    IfElse ladder.

    2) Switch only tests for equality for byte, short, int, char, String,
    and enumerated types.  Cases must be unique inside of a switch, although
    they can be repeated with a nested switch.

    3) IfElse statements test whether boolean result of an expression
    is true or false.  This means an expression can be boolean type, method
    invocations that return a boolean result, and relational operator
    expressions including the equality operator.  Test cases can be
    repeated as needed.

    4) Switch statements need an explicit break; statement in order to
    jump out of the switch and proceed to the next line of code following
    the switch.  IfElse ladder will break out on it's own without the need
    for the explicit break statement.

  Although IfElse statements ultimately have a broader coverage of tests
  switch statements are more efficient when only testing for equility.
*/

class IfElseSwitch {
  public static void main(String[] args) {
    int month = 4;
    String season;

    if (month == 12 || month == 1 || month == 2) {
      season = "Winter";
    } else if (month == 3 || month == 4 || month == 5) {
      season = "Spring";
    } else if (month == 6 || month == 7 || month == 8) {
      season = "Summer";
    } else if (month == 9 || month == 10 || month == 11) {
      season = "Autumn";
    } else {
      season = "Bogus Month";
    }

    System.out.println("April is in the " + season + ".");

    int month2 = 6;

    switch (month2) {
      case 12:
      case 1:
      case 2:
        season = "Winter";
        break;
      case 3:
      case 4:
      case 5:
        season = "Spring";
        break;
      case 6:
      case 7:
      case 8:
        season = "Summer";
        break;
      case 9:
      case 10:
      case 11:
        season = "Autumn";
        break;
      default:
        season = "Bogus Month";
    }

    System.out.println("June is in the " + season + ".");

  }
}
