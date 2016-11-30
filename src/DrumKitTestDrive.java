/**
 * Created by anthonyfortney on 11/29/16.
 */
public class DrumKitTestDrive {
    public static void main(String[] args) {

        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();

        if (d.snare == true) {
            d.playSnare();
        }
    }
}
