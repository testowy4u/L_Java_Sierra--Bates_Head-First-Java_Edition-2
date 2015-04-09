// Author = Rolando
//
public class DrumKit {                                  // 10

//    boolean topHat = true;                              // 3
//    boolean snare = true;

    void playSnare() {                                  // 4
        System.out.println("bang bang ba-bang");
    }

    void playTopHat() {
        System.out.println("ding ding da-ding");        // 11
    }


}

class DrumKitTestDrive {                                // 8
    public static void main(String [] args) {           // 5

        DrumKit d = new DrumKit();                      // 2

        d.playSnare();                                  // 1
        d.playTopHat();                                 // 9

//        d.snare = false;                                // 7
//        if (d.snare == true) {                          // 6
//            d.playSnare();                              // code not needed
//        }
    }
}