// Author = Rolando
// Chapter 1-2
public class Loopy {
    public static void main (String[] args) {
        int x = 1;

        System.out.println("Before the Loop");
        while (x < 4) {
            System.out.println("In the loop");
            System.out.println("Value of x is " + x);
            x = x + 1;
        } // end while loop
        System.out.println("This is after the loop");
    } // end of method
} // end of class

//class IfTest {
//    public static void main (String[] args) {
//        int x = 3;
//        if (x == 3) {
//            System.out.println("x must be 3");
//        }
//        System.out.println("This runs no matter what");
//    }
//}
//
//class IfTest2 {
//    public static void main (String[] args) {
//        int x = 2;
//        if (x == 3) {
//            System.out.println("x must be 3");
//        } else {
//            System.out.println("x is NOT 3");
//        }
//        System.out.println("This runs no matter what");
//    }
//}