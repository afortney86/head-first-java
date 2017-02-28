package ChapterFour;

/**
 * Created by anthonyfortney on 2/22/17.
 */
public class Dog {

// Encapsulating the Dog class

// Make the instance variables private
    private int size;
    private String name;

// Make the getters and setters public


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void bark() {
        if (size > 60) {

            System.out.println("Woof! Woof!");

        } else if (size > 14) {

            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
