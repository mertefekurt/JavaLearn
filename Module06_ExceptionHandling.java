import java.util.Scanner;

public class Module06_ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter first number: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter second number: ");
            int num2 = Integer.parseInt(scanner.nextLine());
            
            int result = divide(num1, num2);
            System.out.println("Result: " + result);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Scanner closed");
        }
        
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        }
        
        try {
            String text = null;
            System.out.println("Length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer exception");
        }
        
        System.out.println("\n=== Custom Exceptions ===");
        demonstrateCustomException();
        
        System.out.println("\n=== Chained Exceptions ===");
        demonstrateChainedExceptions();
        
        System.out.println("\n=== Try-With-Resources ===");
        try (Resource resource = new Resource()) {
            resource.use();
        } catch (Exception e) {
            System.out.println("Error using resource: " + e.getMessage());
        }
        
        System.out.println("\n=== Multiple Catch Blocks ===");
        try {
            int[] arr = new int[5];
            arr[10] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        }
    }
    
    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    
    static void demonstrateCustomException() {
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        }
        
        try {
            validateAge(25);
            System.out.println("Age validation passed");
        } catch (InvalidAgeException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        }
    }
    
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18, but got: " + age);
        }
    }
    
    static void demonstrateChainedExceptions() {
        try {
            processData();
        } catch (DataProcessingException e) {
            System.out.println("Caught: " + e.getMessage());
            System.out.println("Cause: " + e.getCause().getMessage());
        }
    }
    
    static void processData() throws DataProcessingException {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            throw new DataProcessingException("Failed to process data", e);
        }
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class DataProcessingException extends Exception {
    DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}

class Resource implements AutoCloseable {
    void use() throws Exception {
        System.out.println("Using resource...");
    }
    
    @Override
    public void close() throws Exception {
        System.out.println("Resource closed automatically");
    }
}

