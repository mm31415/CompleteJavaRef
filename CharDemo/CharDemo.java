/*
  Characters

  Java uses Unicode to represent characters.  Univode defines a fully
  international character set that can represent all characters found
  in all human languages.

  char -
    width: 16bits, range: 0 to 65,536

    There are no negative chars.

    The standard set of charanters is known as ASCII (range: 0 to 127).
    The extended 8-bit set, ISO-Latin-1, ranges from 0 to 255.

    The formal specification for Java specifies char as an integral type.
    Meaning it is in the same general category as other integer data types.
*/

class CharDemo {
  public static void main(String[] args) {
    char ch1, ch2;

    // ch1 is assigned the value 88 which is the ASCII and Unicode value
    ch1 = 88; // code for 'X'
    ch2 = 'Y';

    System.out.print("ch1 and ch2: ");
    System.out.println(ch1 + " " + ch2);

    /*
      Although is designed to hold Unicode characters it can also e used
      as an integer type on which you can perform arithmetic properies.
    */
    ch2--;  // decrement ch2;
    System.out.println("ch2 is now: " + ch2);
    ch1++; // increment ch1;
    System.out.println("ch1 is now: " + ch1);


    ch1 += 80; // this will automatically type cast to char
    // the next line will not becuase it promotes char to int
    // ch1 = ch1 + 80;
    System.out.println("ch1 is now: " + ch1);
    char ch3 = (char) (ch1 - ch2); // need to type cast 
    System.out.println(ch1 + " - " + ch2 + " = " + ch3);
  }
}
