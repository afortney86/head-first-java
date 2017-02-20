package ChapterOne;

/**
 * A short Java program is listed below. Your Challenge is to match the candidate block of code( on the left ),
 * with the out put that you'd see if the block were inserted. Not all the lines of output will be used, and some of the lines
 * of output might be used more than once. Draw lines connection the candidate blocks of code with their matching
 * command- line output.
 */
public class MixedMessages {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while(x < 5){
//insert code here


            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}

// Candidates:

//1. y = x - y;

//2. y = y + x;

//3. y = y + 2;
//      if (y > 4){
//          y = y - 1;
//  }

//4.    x = x + 1;
//      y = y + x;

//5. if (y < 5) {
//      x = x + 1;
//          if (y < 3){
//              x = x - 1;
//          }
//      }
//    y = y + 2;
