package ChapterTwo;

/**
 * Created by anthonyfortney on 11/29/16.
 */
public class MovieTestDrive {
    public static void main(String[] args) {
        Movies one = new Movies();
        one.title = "Gone with the stock";
        one.genre = "Tragic";
        one.rating = -2;

        Movies two = new Movies();
        two.title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;
        two.playItOut();

        Movies three = new Movies();
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;
    }
}
