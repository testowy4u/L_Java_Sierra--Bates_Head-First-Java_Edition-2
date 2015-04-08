// Author = Rolando
// Chapter 1-1
public class MyFirstApp {

    public static void main (String[] args) {

        System.out.println("I Rule!");
        System.out.println("The World");

        int x = 3;

        String name = "Dirk";

        x = x * 17;

        System.out.println("x is " + x);

        double d = Math.random();
        System.out.println(name + " is " + d);

        while (x > 12) {
            System.out.println(x);
            x = x - 10;
        } // end while loop

        for (int y = 0; y < 10; y = y + 1) {
            System.out.println("y is now " + y);

        } // end for loop

        if (x == 10) {
            System.out.println("x must be 10");
        } else {
            System.out.println("x is not 10");
        } // end if-else

        if ((x < 3) & (name.equals("Dirk"))) {
            System.out.println("Gently");
        } // end if-else
        System.out.println("this line runs no matter what");

        int z = 4; // assign 4 to z
        while (z > 3) {
            // loop code will run because
            //  is greater than 3
            z = z - 1; // or we'd loop forever
        } // end while loop

//        int a = 27;
//        while (a == 17) {
//             loop code will not run because
//             z is not equal to 17
//        } // end while loop


    } // end of method
} // end of class