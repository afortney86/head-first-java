package ChapterTwo;

/**
 * Created by anthonyfortney on 11/29/16.
 */
public class GuessGame {
    GuessGamePlayer p1; // Three instance Variables
    GuessGamePlayer p2;
    GuessGamePlayer p3;

    public void startGame(){
        p1 = new GuessGamePlayer(); // Three Player objects.
        p2 = new GuessGamePlayer();
        p3 = new GuessGamePlayer();

        int guessp1 = 0; // Three variables for the three players
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false; // Is the player right true(yes) false(no)
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10); // Generate random number
        System.out.println("I'm thinking of a number between 1 and 9...");

        while(true) {
            System.out.println("Number to guess is " + targetNumber);

            p1.guess(); // Calling Players guess method from ChapterTwo.GuessGamePlayer
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player 1 guessed " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player 1 guessed " + guessp2);
            guessp3 = p3.number;
            System.out.println("Player 1 guessed " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over.");
                break; // game over, break out of the loop

            }else {
                //keep going nobody got it right
                System.out.println("Players will have to try again.");
            }// end if/else
        }// end while loop
    }// end method
}// end class
