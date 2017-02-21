package ChapterTwo;

/**
 * Created by anthonyfortney on 2/20/17.
 */
public class PoolPuzzleTwoEchoTestDrive {
    public static void main(String[] args) {
        PoolPuzzleTwoEcho e1 = new PoolPuzzleTwoEcho();
        PoolPuzzleTwoEcho e2 = new PoolPuzzleTwoEcho();

        int x = 0;
//
//        while(x < 4){
//            e1.hello();
//            e1.count = e1.count + 1;
//            if ()
//
//
//            x = x + 1;
//        }
//        ^^^^^^^^^^^^^^^^^ My solution unfinished^^^^^^^^^^^^^^^^^^

        while (x < 4){
            e1.hello();
            e1.count = e1.count + 1;

            if(x == 3){
                e2.count = e2.count + 1;
            }
            if ( x > 0){
                e2.count = e2.count + e1.count;
            }

            x = x + 1;
        }

        System.out.println(e2.count);

    }
}

