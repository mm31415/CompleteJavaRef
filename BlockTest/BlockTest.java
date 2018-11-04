/*
  Java allows two or more statements to be groupd into blocks of code,
  also known as code blocks, by enclosing them between curly braces

  Once a code block is created it becomes a logical unit that can be
  used in any place that a single statement can
*/

class BlockTest {
  public static void main (String[] args) {
    int x, y;

    y = 20;

    for (x = 0; x < 10; x++) {
      System.out.println("This is x: " + x);
      System.out.println("This is y: " + y);
      y = y - 2;
    }
  }
}
