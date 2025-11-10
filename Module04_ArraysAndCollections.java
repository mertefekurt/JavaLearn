import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Module04_ArraysAndCollections {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array length: " + numbers.length);
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);
        
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
        
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("ArrayList size: " + names.size());
        System.out.println("First name: " + names.get(0));
        
        for (String name : names) {
            System.out.println("Name: " + name);
        }
        
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(10);
        uniqueNumbers.add(20);
        uniqueNumbers.add(10);
        uniqueNumbers.add(30);
        System.out.println("HashSet size: " + uniqueNumbers.size());
        
        for (Integer num : uniqueNumbers) {
            System.out.println("Unique number: " + num);
        }
        
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 28);
        System.out.println("HashMap size: " + ages.size());
        System.out.println("Alice's age: " + ages.get("Alice"));
        
        for (String key : ages.keySet()) {
            System.out.println(key + ": " + ages.get(key));
        }
    }
}

