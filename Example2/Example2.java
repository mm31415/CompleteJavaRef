/*
  Variables are name memory locations that can be assigned a value.
  Variables must be declared before being assigned.
  Declaration form: type var-name

  type specifies type of data to be stored in variable
  var-name is the name associated to the memory location
*/

class Example2 {
  public static void main(String[] args) {
    int num; // variable declaration

    num = 100; // assignment, note the data is of type int

    /*
      the variable num is being appended to string "Variable num is: "

      more accurately, num is first being coerced into a String and then
      both strings are being concatenated before printed out to the console
    */
    System.out.println("Variable num is: " + num);

    num = num * 2; // num is being assing to value of num times 2

    /*
      print() does not add a new line
      so the next output starts on the same line

      println() accepts all standard Java types for output, it does not
      neccessarily need to be a String
    */
    System.out.print("num * 2 is ");
    System.out.println(num);
  }
}
