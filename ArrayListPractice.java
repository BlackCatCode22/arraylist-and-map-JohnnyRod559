import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ArrayListPractice {
    public static void main(String[] args) {

        System.out.println("\n\n Welcome to the Array List practice \n\n");

        ArrayList<String> myFriendsList = new ArrayList<>();

        myFriendsList.add("John");
        myFriendsList.add("Chris");
        myFriendsList.add("Eric");
        myFriendsList.add("Luke");
        myFriendsList.add("Mitch");

        System.out.println("\n My first friend is: " + myFriendsList.get(0));
        System.out.println("\n");

        System.out.println("\n My second friend is: " + myFriendsList.get(1));
        System.out.println("\n");

        System.out.println("\n My third friend is: " + myFriendsList.get(2));
        System.out.println("\n");

        System.out.println("\n My fourth friend is: " + myFriendsList.get(3));
        System.out.println("\n");

        System.out.println("\n My fifth friend is: " + myFriendsList.get(4));
        System.out.println("\n");

        System.out.println("\n the size  " + myFriendsList.size());
        System.out.println("\n");

        // set change
        myFriendsList.set(0, "Johnny");
        //Expect Johnny
        System.out.println("\n My first friend is now:  " + myFriendsList.get(0));
        System.out.println("\n");

        System.out.println(myFriendsList);
        System.out.println("\n");

        //remove the third element
       myFriendsList.remove(2);

        //output the list without a for loop
        System.out.println(myFriendsList);
        System.out.println("\n");

        // output the list using a for loop

        int myFriendNumber = 0;

        for (int i = 0; i <= 4; i++ ) {
            System.out.println(" Friend " + myFriendNumber + " is " + myFriendsList.get(i));

            myFriendNumber++;
        }

        // add list elements with a for loop
        for (int i = 0; i < 10; i++) {
            // use .add
            myFriendsList.add(i+4, " New Friend");
            System.out.println( "New friend added to the list");

        }
        System.out.println(myFriendsList);
        System.out.println("\n");






    }
}