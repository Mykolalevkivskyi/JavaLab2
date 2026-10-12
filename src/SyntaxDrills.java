public class SyntaxDrills {
    public static void main(String[] args) {
      //Task 1 The "Drills"

        // Task 1.1: Identifier Validation
        int age = 18;
        int studentAge = 19;
        int _number = 10;

        /*int 1age = 18; - an error, because a variable name cannot start with a digit
        int class = 5; - an error, because `class` is a reserved word in Java
        int my-age = 20; - an error, because a hyphen is not allowed in a variable name
         */

        // Task 1.2 Case Sensitivity

        int score = 10;
        int Score = 20;
        int SCORE = 30;

        System.out.println(score);
        System.out.println(Score);
        System.out.println(SCORE);

        // Task 1.3 The Constant

        final int MAX_SCORE = 100;

        /* MAX_SCORE = 200;
            Error: Cannot assign a value a final variable.
            A final variable cannot be reassigned after initialization.
         */

        System.out.println(MAX_SCORE);

        // Task 1.4 Floating point suffixes

        /* float number = 10.5;
            Error; Incompatible types.
            A duble cannot be assigned to float without casting.
         */

        float number = 10.5f;
        System.out.println(number);

        // Task 1.5 String vs Char

        char c = 'A';
        String s = "A";

        /* c = s
        Error: String cannot be converted to char
            s = c
        Error: char cannot be converted to String
         */

        System.out.println(c);
        System.out.println(s);

        // Task 1.6 Integer Truncation

        int a = 10;
        int b = 3;
        double result = a / b;
        System.out.println(result);

        // Task 1.7 Implicit Widening

        int smallNumber = 50;
        long bigNumber = smallNumber;
        System.out.println(bigNumber);

        // Task 1.8 Explicit Narrowing

        double d = 9.99;
        int x = (int) d;

        System.out.println(x);

        // Task 1.9 The Modulus Logic

        int numberToCheck = 157;

        if (numberToCheck % 2 == 0 ) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

       // Task 1.10 Escape Formatting

        System.out.println("1\t2\t3\n4\t5\t6\n7\t8\t9");

        // Task 1.11 Array Bounds

        int[] numbers = {17, 19, 14};

        /* System.out.println(numbers[3]);
        Error: ArrayIndexOutOfBoundsException
        The array has only 3 elements with indexes 0, 1, and 2.
         */

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        //Task 1.12 Array Shortcut
        int[] favoriteNumbers = {14, 17, 9, 19, 11};
        System.out.println(favoriteNumbers[0]);
        System.out.println(favoriteNumbers[favoriteNumbers.length - 1]);

    }

}
