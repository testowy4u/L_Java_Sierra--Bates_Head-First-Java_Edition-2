// Author = Rolando
// Chapter 1-7
public class Exercise1a {                       // Compiles but
    public static void main (String[] args) {
        int x = 5;                              // Variable should be greater than 3
        while (x < 10) {                        // but less than 10
            if (x > 3){                         // While loop should add 1 to x
                System.out.println("big x");
            }
        }
    }
}

class Exercise1b {                              // Did not have class statement
    public static void main (String[] args) {
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x > 3) {
                System.out.println("small x");
            }
        }
    }
}

class Exercise1c {
    public static void main (String[] args) {   // Did not have method statement
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x > 3) {
                System.out.println("small x");
            }
        }
    }
}

// Java cross 7.0 answers
//
// Down:
//
// 1.  float
// 2.  None
// 3.
// 5.
// 7.
// 10. compiler
// 11. variable
// 13. IT
// 15.
// 16.
// 17.
// 20. JVM
//
// Across:
//
// 4.
// 6.  loop
// 8.  ifTest
// 9.
// 12.
// 13.
// 14.
// 18. String
// 19.
// 21.