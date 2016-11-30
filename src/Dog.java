/**
 * Created by anthonyfortney on 11/29/16.
 */
public class Dog {
    String name;
    public static void main(String[] args) {
        // Make a dog object and access it
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        // Now make a dog array
        Dog[] myDogs = new Dog[3];
        // and put some dogs in it
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        //now access the dogs using the array
        //references

        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        //what is myDogs[2] name?
        System.out.print("Last dog's name is ");
        System.out.println(myDogs[2].name);

        //loop through the array and tell all the dogs to bark
        int x = 0;
        while(x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }

    }

    public void bark(){
        System.out.println(name + " says Ruff!");
    }

}


//      First Exercise
//    int size;
//    String breed;
//    String name;
//
//    void bark() {
//        System.out.println("Ruff, Ruff");
//    }
