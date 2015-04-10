// Author = Rolando
//
public class TestArrays {                           // 11
    public static void main(String[] args) {

        String[] islands = new String[4];           // 7
        int[] index = new int[4];                   // 9
        int y = 0;                                  // 1

        islands[0] = "Bermuda";                     // 3
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";
        index[0] = 1;                               // 6
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int ref;                                    // 4
        while (y < 4) {
            ref = index[y];                         // 2
            System.out.print("island = ");          // 8
            System.out.println(islands[ref]);       // 5
            y = y + 1;                              // 10
        }
    }
}