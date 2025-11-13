import java.util.*;

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
        
        System.out.println("\n=== LinkedList Operations ===");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.addFirst("Zero");
        linkedList.addLast("Third");
        System.out.println("LinkedList: " + linkedList);
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());
        
        System.out.println("\n=== TreeSet (Sorted Set) ===");
        TreeSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(30);
        sortedSet.add(10);
        sortedSet.add(20);
        sortedSet.add(50);
        sortedSet.add(40);
        System.out.println("TreeSet (sorted): " + sortedSet);
        System.out.println("First element: " + sortedSet.first());
        System.out.println("Last element: " + sortedSet.last());
        System.out.println("Elements less than 30: " + sortedSet.headSet(30));
        
        System.out.println("\n=== TreeMap (Sorted Map) ===");
        TreeMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Charlie", 28);
        sortedMap.put("Alice", 25);
        sortedMap.put("Bob", 30);
        System.out.println("TreeMap (sorted by key): " + sortedMap);
        
        System.out.println("\n=== Array Operations ===");
        int[] arr = {5, 2, 8, 1, 9, 3};
        System.out.println("Original array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        int index = Arrays.binarySearch(arr, 5);
        System.out.println("Index of 5: " + index);
        
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied array: " + Arrays.toString(arr2));
        System.out.println("Arrays equal: " + Arrays.equals(arr, arr2));
        
        System.out.println("\n=== Collection Operations ===");
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8));
        
        List<Integer> union = new ArrayList<>(list1);
        union.addAll(list2);
        System.out.println("Union: " + union);
        
        List<Integer> intersection = new ArrayList<>(list1);
        intersection.retainAll(list2);
        System.out.println("Intersection: " + intersection);
        
        List<Integer> difference = new ArrayList<>(list1);
        difference.removeAll(list2);
        System.out.println("Difference (list1 - list2): " + difference);
        
        System.out.println("\n=== Iterator Usage ===");
        Iterator<String> nameIterator = names.iterator();
        System.out.println("Names using iterator:");
        while (nameIterator.hasNext()) {
            System.out.println("  - " + nameIterator.next());
        }
        
        System.out.println("\n=== Collections Utility Methods ===");
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6));
        System.out.println("Original: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);
        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);
        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);
        System.out.println("Max: " + Collections.max(numbers));
        System.out.println("Min: " + Collections.min(numbers));
        System.out.println("Frequency of 1: " + Collections.frequency(numbers, 1));
    }
}

