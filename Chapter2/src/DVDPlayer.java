// Author = Rolando
//
public class DVDPlayer {

    boolean canRecord = false;

    void playDVD() {                            // solution code
        System.out.println("DVD playing");      //
    }

    void recordDVD() {
        System.out.println("DVD recording");
    }
}

class DCDPlayerTestDrive {
    public static void main(String[] args) {

        DVDPlayer d = new DVDPlayer();

        d.canRecord = true;
        d.playDVD();

        if (d.canRecord == true) {              // but bool is always true
            d.recordDVD();
        }
    }
}