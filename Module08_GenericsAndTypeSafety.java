import java.util.ArrayList;
import java.util.List;

public class Module08_GenericsAndTypeSafety {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello");
        Box<Integer> intBox = new Box<>(42);
        Box<Double> doubleBox = new Box<>(3.14);
        
        System.out.println("String box: " + stringBox.getContent());
        System.out.println("Integer box: " + intBox.getContent());
        System.out.println("Double box: " + doubleBox.getContent());
        
        Pair<String, Integer> pair1 = new Pair<>("Alice", 25);
        Pair<String, String> pair2 = new Pair<>("Key", "Value");
        
        System.out.println("Pair 1 - Key: " + pair1.getFirst() + ", Value: " + pair1.getSecond());
        System.out.println("Pair 2 - Key: " + pair2.getFirst() + ", Value: " + pair2.getSecond());
        
        NumberContainer<Integer> intContainer = new NumberContainer<>(100);
        NumberContainer<Double> doubleContainer = new NumberContainer<>(99.5);
        
        System.out.println("Int container: " + intContainer.getValue());
        System.out.println("Double container: " + doubleContainer.getValue());
        
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        
        System.out.println("String list:");
        printList(stringList);
        
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        
        System.out.println("Integer list:");
        printList(intList);
        
        GenericStack<String> stack = new GenericStack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        
        System.out.println("Stack size: " + stack.size());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack size after pop: " + stack.size());
        
        Calculator<Integer> intCalc = new Calculator<>();
        System.out.println("Sum: " + intCalc.add(10, 20));
        System.out.println("Product: " + intCalc.multiply(5, 6));
        
        Calculator<Double> doubleCalc = new Calculator<>();
        System.out.println("Sum: " + doubleCalc.add(10.5, 20.3));
        System.out.println("Product: " + doubleCalc.multiply(2.5, 4.0));
    }
    
    static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println("  - " + item);
        }
    }
}

class Box<T> {
    private T content;
    
    Box(T content) {
        this.content = content;
    }
    
    T getContent() {
        return content;
    }
    
    void setContent(T content) {
        this.content = content;
    }
}

class Pair<K, V> {
    private K first;
    private V second;
    
    Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }
    
    K getFirst() {
        return first;
    }
    
    V getSecond() {
        return second;
    }
    
    void setFirst(K first) {
        this.first = first;
    }
    
    void setSecond(V second) {
        this.second = second;
    }
}

class NumberContainer<T extends Number> {
    private T value;
    
    NumberContainer(T value) {
        this.value = value;
    }
    
    T getValue() {
        return value;
    }
    
    double getDoubleValue() {
        return value.doubleValue();
    }
}

class GenericStack<T> {
    private List<T> elements = new ArrayList<>();
    
    void push(T element) {
        elements.add(element);
    }
    
    T pop() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.remove(elements.size() - 1);
    }
    
    T peek() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.get(elements.size() - 1);
    }
    
    int size() {
        return elements.size();
    }
    
    boolean isEmpty() {
        return elements.isEmpty();
    }
}

class Calculator<T extends Number> {
    double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
    
    double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }
    
    double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }
    
    double divide(T a, T b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a.doubleValue() / b.doubleValue();
    }
}

