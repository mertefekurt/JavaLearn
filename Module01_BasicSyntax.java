public class Module01_BasicSyntax {
    public static void main(String[] args) {
        byte byteValue = 127;
        short shortValue = 32767;
        int number = 42;
        long longValue = 9223372036854775807L;
        double decimal = 3.14;
        float floatValue = 2.5f;
        char character = 'A';
        boolean isTrue = true;
        String text = "learning java";
        
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + number);
        System.out.println("long: " + longValue);
        System.out.println("double: " + decimal);
        System.out.println("float: " + floatValue);
        System.out.println("char: " + character);
        System.out.println("boolean: " + isTrue);
        System.out.println("string: " + text);
        
        int a = 10;
        int b = 5;
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;
        
        System.out.println("sum: " + sum);
        System.out.println("difference: " + diff);
        System.out.println("product: " + product);
        System.out.println("quotient: " + quotient);
        System.out.println("remainder: " + remainder);
        
        boolean isEqual = (a == b);
        boolean isGreater = (a > b);
        boolean isLess = (a < b);
        boolean isNotEqual = (a != b);
        
        System.out.println("a == b: " + isEqual);
        System.out.println("a > b: " + isGreater);
        System.out.println("a < b: " + isLess);
        System.out.println("a != b: " + isNotEqual);
        
        boolean andResult = (a > 5) && (b < 10);
        boolean orResult = (a > 15) || (b < 3);
        boolean notResult = !isTrue;
        
        System.out.println("and: " + andResult);
        System.out.println("or: " + orResult);
        System.out.println("not: " + notResult);
        
        String firstName = "john";
        String lastName = "doe";
        String fullName = firstName + " " + lastName;
        int nameLength = fullName.length();
        String upperName = fullName.toUpperCase();
        String lowerName = fullName.toLowerCase();
        String substring = fullName.substring(0, 4);
        
        System.out.println("full name: " + fullName);
        System.out.println("length: " + nameLength);
        System.out.println("uppercase: " + upperName);
        System.out.println("lowercase: " + lowerName);
        System.out.println("substring: " + substring);
        
        int integer = 100;
        double doubleNumber = integer;
        float floatNumber = (float) doubleNumber;
        int backToInt = (int) doubleNumber;
        
        System.out.println("int to double: " + doubleNumber);
        System.out.println("double to float: " + floatNumber);
        System.out.println("double to int: " + backToInt);
        
        a += 5;
        b -= 2;
        product *= 2;
        quotient /= 2;
        
        System.out.println("a after +=: " + a);
        System.out.println("b after -=: " + b);
        System.out.println("product after *=: " + product);
        System.out.println("quotient after /=: " + quotient);
    }
}
