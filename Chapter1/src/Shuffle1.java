// Author = Rolando
// Chapter 1-6
public class Shuffle1 {                             // 3
    public static void main (String[] args) {
        int x = 3;                                  // 5

        while (x > 0) {                             // 7

            if (x > 2) {                            // 4
                System.out.print("a");
            }

            if (x == 2) {                           // 2
                System.out.print("b c");
            }

            x = x - 1;                              // 6
            System.out.print("-");

            if (x == 1) {                           // 1
                System.out.print("d");
                x = x - 1;
            }
        }
    }
}