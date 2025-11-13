import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Module11_LambdaAndFunctionalProgramming {
    public static void main(String[] args) {
        System.out.println("=== Lambda Expressions ===");
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        
        names.forEach(name -> System.out.println("Name: " + name));
        
        System.out.println("\n=== Method References ===");
        names.forEach(System.out::println);
        
        System.out.println("\n=== Functional Interfaces - Predicate ===");
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isPositive = n -> n > 0;
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);
        
        List<Integer> positiveEven = numbers.stream()
                .filter(isPositive.and(isEven))
                .collect(Collectors.toList());
        System.out.println("Positive even numbers: " + positiveEven);
        
        System.out.println("\n=== Functional Interfaces - Function ===");
        Function<String, Integer> stringLength = String::length;
        Function<Integer, Integer> square = n -> n * n;
        
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        List<Integer> lengths = words.stream()
                .map(stringLength)
                .collect(Collectors.toList());
        System.out.println("String lengths: " + lengths);
        
        List<Integer> squared = numbers.stream()
                .map(square)
                .collect(Collectors.toList());
        System.out.println("Squared numbers: " + squared);
        
        System.out.println("\n=== Functional Interfaces - Consumer ===");
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        words.forEach(printUpperCase);
        
        System.out.println("\n=== Functional Interfaces - Supplier ===");
        Supplier<Double> randomSupplier = () -> Math.random() * 100;
        System.out.println("Random value 1: " + randomSupplier.get());
        System.out.println("Random value 2: " + randomSupplier.get());
        
        System.out.println("\n=== Stream Operations ===");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        int sum = nums.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();
        System.out.println("Sum of even numbers: " + sum);
        
        Optional<Integer> max = nums.stream()
                .max(Integer::compareTo);
        max.ifPresent(m -> System.out.println("Max value: " + m));
        
        long count = nums.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println("Count of numbers > 5: " + count);
        
        List<Integer> sorted = nums.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted descending: " + sorted);
        
        System.out.println("\n=== Stream - Map and FlatMap ===");
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        
        List<Integer> flattened = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("Flattened list: " + flattened);
        
        System.out.println("\n=== Stream - Reduce ===");
        Optional<Integer> product = nums.stream()
                .reduce((a, b) -> a * b);
        product.ifPresent(p -> System.out.println("Product: " + p));
        
        int sumWithIdentity = nums.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum with identity: " + sumWithIdentity);
        
        System.out.println("\n=== Stream - Collectors ===");
        Map<Boolean, List<Integer>> partitioned = nums.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Partitioned by even/odd: " + partitioned);
        
        Map<Integer, Long> grouped = nums.stream()
                .collect(Collectors.groupingBy(n -> n % 3, Collectors.counting()));
        System.out.println("Grouped by mod 3: " + grouped);
        
        String joined = names.stream()
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println("Joined names: " + joined);
        
        System.out.println("\n=== Custom Functional Interface ===");
        Calculator calc = (a, b, operation) -> {
            switch (operation) {
                case "add": return a + b;
                case "multiply": return a * b;
                case "subtract": return a - b;
                default: return 0;
            }
        };
        
        System.out.println("10 + 5 = " + calc.calculate(10, 5, "add"));
        System.out.println("10 * 5 = " + calc.calculate(10, 5, "multiply"));
        System.out.println("10 - 5 = " + calc.calculate(10, 5, "subtract"));
        
        System.out.println("\n=== Stream - Parallel Processing ===");
        List<Integer> largeList = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            largeList.add(i);
        }
        
        long start = System.currentTimeMillis();
        int sequentialSum = largeList.stream()
                .mapToInt(n -> n * n)
                .sum();
        long sequentialTime = System.currentTimeMillis() - start;
        
        start = System.currentTimeMillis();
        int parallelSum = largeList.parallelStream()
                .mapToInt(n -> n * n)
                .sum();
        long parallelTime = System.currentTimeMillis() - start;
        
        System.out.println("Sequential sum: " + sequentialSum + " (time: " + sequentialTime + "ms)");
        System.out.println("Parallel sum: " + parallelSum + " (time: " + parallelTime + "ms)");
    }
}

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b, String operation);
}

