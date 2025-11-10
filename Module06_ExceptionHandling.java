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
    }
    
    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

