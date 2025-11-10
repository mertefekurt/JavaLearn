public class Module01_BasicSyntax {
    public static void main(String[] args) {
        int number = 42;
        double decimal = 3.14;
        char character = 'A';
        boolean isTrue = true;
        String text = "learning java";
        
        System.out.println("number: " + number);
        System.out.println("decimal: " + decimal);
        System.out.println("character: " + character);
        System.out.println("boolean: " + isTrue);
        System.out.println("text: " + text);
        
        int a = 10;
        int b = 5;
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int quotient = a / b;
        
        System.out.println("sum: " + sum);
        System.out.println("difference: " + diff);
        System.out.println("product: " + product);
        System.out.println("quotient: " + quotient);
        
        int integer = 100;
        double doubleNumber = integer;
        float floatNumber = (float) doubleNumber;
        
        System.out.println("converted to double: " + doubleNumber);
        System.out.println("converted to float: " + floatNumber);
    }
}
