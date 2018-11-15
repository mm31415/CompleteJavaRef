/*
  Arrays are groups of like-typed variables that are reffered by a
  common name.  Arrays of any type can be created and have one or more
  dimensions.  Specific elements of the array can be accessed or assigned
  through indexing.

  Declaration form: type var-name[]  or type[] var-name

  type is the element type or base type of the array
  var-name is the identifier
  [] it to show it is an array variable

  Although the declaration establishes the fact that it is an array
  variable an array does not actually exist yet.  In order to link var-name
  to an actual array one must allocate space in memory using the 'new'
  keyword.

  new is a special type of operator used to allocate memory

  Initialization form: var-name = new type[size]

  new allocates space in memory
  type is element type for array
  size is the number of elements in the array

  Java will only allocate the needed space for the array specified by size.
  A runtime error will occur if one tries to store or reference a value outside
  of the range (meaning a negative index value or >= length of the array)

  Note: runtime errors do not pop up during compiling, they happen when
  trying to execute the program.

  Multidimensional Arrays Form

    type[][] var-name = new type[size][size]
*/
class Array {
  public static void main(String[] args) {
    /*
      int[] month_days;
      month_days = new int[12];

      month_days[0] = 31;
      month_days[1] = 28;
      ...
      month_days[11] = 31;
    */

    /*
      int[] month_days = new int[12];

      month_days[0] = 31;
      month_days[1] = 28;
      ...
      month_days[11] = 31;
    */

    int[] month_days = { 31, 28, 31, 30, 31 }; // array initializer

    // month_days[5] = 30; // Error ArrayIndex out of bounds

    System.out.println("April has " + month_days[3] + " days.");

    // Two Dimensional Array also know as Matrix
    /*
      Conceptual View of twoD with index values
      | [0][0] | [0,1] | [0,2] | [0,3] |
      | [1][0] | [1,1] | [1,2] | [1,3] |
      | [2][0] | [2,1] | [2,2] | [2,3] |
    */
    int[][] twoD = new int[3][4];
    int i, j, k = 0;

    /*
      Conceptual View of twoD with index values
      | 0 | 1 | 2 | 3 |
      | 4 | 5 | 6 | 7 |
      | 8 | 9 | 10 | 11 |
    */
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 4; j++) {
        twoD[i][j] = k;
        k++;
      }
    }

    for (i = 0; i < 3; i++) {
      for (j = 0; j < 4; j++) {
        System.out.print(twoD[i][j] + " ");
      }
      System.out.println();
    }
  }
}
