/*
  This is a multiline comment
  for the first java program in the book

  the name of the source file should match name of the class
  this case Example.java matches the Example class

  ~$ javac Example.java - to compile --> Example.class
  ~$ java Example - to execute Example.class
*/

// This is a single line comment
// .java is for source file that is called compilation unit
// .class contains the Java bytecode version of program

/*
  class is a keyword used declare the a new class being defined
  Example is the identifier/name of class
*/
class Example {
  /*
    public is an access modifier that allows programmer to
    control the visibility of class members.
    When a class member is public it can be accessed by code outside of
    the class.

    The static keyword means main() can be called without having to
    instantiate an instance of the class.
    This is needed because main() is called by the Java Virtual Machine
    before any objects are created.

    void keyword means nothing is returned by the method

    parameters are the variables specified within the parentheses following
    the method name
    main has only on parameter called args which is an array of instances
    of the class String

    An Array is a collection of similar objects

    Objects of type String store charater strings

    args receives any comman line arguments present when the program is executed
  */
  public static void main(String[] args) {
    /*
      this is the body of main()

      System is a predefined class that allows access to the System
      out is the output stream connected to the console
      println() is the method that accepts a string and outputs to
      console with a new line a the end

      semi-colons are needed to end statements
    */
    System.out.println("This is an example program");
    
  } //ends main
} //ends Example
