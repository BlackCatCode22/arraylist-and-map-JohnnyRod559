import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("John", 12345);
        empIds.put("Carl", 67891);
        empIds.put("Jerry", 23456);

        System.out.println(empIds);

        System.out.println(empIds.get("Jerry"));

        System.out.println(empIds.containsKey("John"));

        empIds.put("John", 1111);
        System.out.println(empIds);

        empIds.replace("John", 7777);
        System.out.println(empIds);

        empIds.putIfAbsent("Steve", 5656);
        System.out.println(empIds);
    }
}