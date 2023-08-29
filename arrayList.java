import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class arrayList {
    public static void main(String[] args) {

        // "NEW" reserves memory
        Scanner scanner = new Scanner(System.in);
        System.out.println(" \n\n Welcome to the Array List practice program! \n\n");

        System.out.print(" Please enter your name: \n");
        String userName = scanner.nextLine();

        System.out.println("\n Welcome " + userName + " Lets get started! \n\n");
        //set size. Arrays have fixed size
        //String[] friendsArray = new String[4];
        System.out.println("Lets code along with the video \n\n");

        //input values individually
        String[] friendsArray = {"John", "Chris", "Eric", "Luke"};

        // Array list does not have a fixed/set size
       // ArrayList<String> friendsArrayList = new ArrayList<>();
        ArrayList<String> friendsArrayList =
         new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));

        System.out.println(friendsArray[1]);
        System.out.println("\n");
        System.out.println(friendsArrayList.get(1));
        System.out.println("\n");

        System.out.println(friendsArray.length);
        System.out.println("\n");
        System.out.println(friendsArrayList.size());
        System.out.println("\n");

        System.out.println(friendsArrayList);

        // Added Mitch
        friendsArrayList.add("Mitch");
        //confirmed mitch is at index 4
        System.out.println(friendsArrayList.get(4));
        System.out.println("\n");

        //set new name at appointed index
        friendsArray[0] = "Carl";
        System.out.println(friendsArray[0]);
        System.out.println("\n");


        friendsArrayList.set(0, "Carl");
        System.out.println(friendsArrayList.get(0));
        System.out.println("\n");

        // remove Chris & confirm it was removed and new name added
        friendsArrayList.remove("Chris");
        System.out.println(friendsArrayList.get(1));
        System.out.println("\n");

        //shows the path of the array
        System.out.println(friendsArray);
        //Shows list of data
        System.out.println(friendsArrayList);
        System.out.println("\n");

        friendsArrayList.add("Mike");
        System.out.println(friendsArrayList.get(4));
        System.out.println("\n");

        friendsArrayList.set(0, "Todd");
        System.out.println(friendsArrayList.get(0));
        System.out.println("\n");

        friendsArrayList.remove("Carl");
        System.out.println(friendsArrayList.get(0));
        System.out.println("\n");

        System.out.println(friendsArrayList);

        friendsArrayList.remove("Eric");
        System.out.println("\n");
        System.out.println(friendsArrayList.get(1));
        System.out.println("\n");

        System.out.println(friendsArrayList);

        friendsArrayList.add("Jake");
        System.out.println("\n");
        System.out.println(friendsArrayList.get(4));
        System.out.println("\n");


        friendsArrayList.remove("Luke");
        System.out.println(friendsArrayList.get(1));
        System.out.println("\n");

        System.out.println(friendsArrayList);













    }
}