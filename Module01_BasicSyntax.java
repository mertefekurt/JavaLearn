public class Module01_BasicSyntax {
    public static void main(String[] args) {
        // basic data types
        int number = 42;
        double decimal = 3.14;
        char character = 'A';
        boolean isTrue = true;
        String text = "Learning Java";
        
        // printing variables
        System.out.println("Number: " + number);
        System.out.println("Decimal: " + decimal);
        System.out.println("Character: " + character);
        System.out.println("Boolean: " + isTrue);
        System.out.println("Text: " + text);
        
        // arithmetic operations
        int a = 10;
        int b = 5;
        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Quotient: " + (a / b));
        
        // type conversion
        int integer = 100;
        double doubleNumber = integer;
        System.out.println("Converted: " + doubleNumber);
    }
}

