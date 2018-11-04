/*
  if statement simplest form:  if(condition) statement;

  condition represents a Boolean expression meaning it evaluates to
  either true or false

  if condition is true the statement is executed
  if condition is false then the statement is bypassed

  Some common relational operators:
  < - less than
  > - greater than
  == - equal to

  note:
    = is for assignment
    == is for equality
*/

class IfSample {
  public static void main(String[] args) {
    /*
      use commas to separate variable names when declaring multiple
      variables of the same type
    */
    int x, y;

    x = 10;
    y = 20;

    if (x < y) System.out.println("x is less than y");

    x = x * 2;
    if (x == y) System.out.println("x is equal to y");

    x = x * 2;
    if (x > y) System.out.println("x is greater than y");

    // this won't display anything
    if (x == y) System.out.println("This statement is bypassed");
  }
}
