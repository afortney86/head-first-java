/**
 * Created by anthonyfortney on 11/29/16.
 */
public class GuessGamePlayer {

    int number = 0;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
