/*
  for loop form: for (initialization; condition; iteration) statement;

  initialization - sets a loop control variable to initial value
  condition - Boolean expression that test control variable
  iteration - determines how control variable is changed each iteration

  if condition is true statement is executed, loop will continue until
  condition is false
*/

class ForTest {
  public static void main(String[] args) {
    int x;

    /*
      x++ is similar to x + 1
      x-- is similar to x - 1

      ++ increment operator, incremenents operand by 1
      -- decrement operator, decrements operand by 1
    */
    for (x = 0; x < 10; x++)
      System.out.println("This is x: " + x);
  }
}
