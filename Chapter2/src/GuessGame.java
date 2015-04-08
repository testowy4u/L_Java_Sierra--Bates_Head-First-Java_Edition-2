// Author = Rolando
//
public class GuessGame {
    // Instance variables for class
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        // create player objects and assign them to the instance variables
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // declare variables to declare guess players make
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        // declare three variables to hold true/false values based on player answer
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        // make a target number form 1-9 picked at random
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            // call each player's guess() method
            p1.guess();
            p2.guess();
            p3.guess();

            // each player's guess
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);
            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            // check each player's guess to see if it matches the target number
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            // if any player is right
            if (p1isRight || p2isRight || p3isRight) {

                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over.");
                break; // game over, break while loop
            } else { // otherwise stay in loop and try again
                System.out.println("Players will have to try again");
            }// end if/else statement
        } // end while loop
    } // end method
} // end class