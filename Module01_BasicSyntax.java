public class Module01_BasicSyntax {
    public static void main(String[] args) {
        System.out.println("=== Primitive Data Types ===");
        byte byteValue = 127;
        short shortValue = 32767;
        int number = 42;
        long longValue = 9223372036854775807L;
        double decimal = 3.14;
        float floatValue = 2.5f;
        char character = 'A';
        boolean isTrue = true;
        String text = "learning java";
        
        System.out.println("byte: " + byteValue + " (range: -128 to 127)");
        System.out.println("short: " + shortValue + " (range: -32,768 to 32,767)");
        System.out.println("int: " + number + " (range: -2^31 to 2^31-1)");
        System.out.println("long: " + longValue + " (range: -2^63 to 2^63-1)");
        System.out.println("double: " + decimal + " (64-bit floating point)");
        System.out.println("float: " + floatValue + " (32-bit floating point)");
        System.out.println("char: " + character + " (Unicode character)");
        System.out.println("boolean: " + isTrue + " (true or false)");
        System.out.println("string: " + text + " (object type)");
        
        System.out.println("\n=== Type Sizes ===");
        System.out.println("byte size: " + Byte.BYTES + " bytes");
        System.out.println("short size: " + Short.BYTES + " bytes");
        System.out.println("int size: " + Integer.BYTES + " bytes");
        System.out.println("long size: " + Long.BYTES + " bytes");
        System.out.println("float size: " + Float.BYTES + " bytes");
        System.out.println("double size: " + Double.BYTES + " bytes");
        
        System.out.println("\n=== Arithmetic Operations ===");
        int a = 10;
        int b = 5;
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;
        
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + diff);
        System.out.println(a + " * " + b + " = " + product);
        System.out.println(a + " / " + b + " = " + quotient);
        System.out.println(a + " % " + b + " = " + remainder);
        
        double preciseDivision = (double) a / b;
        System.out.println("Precise division: " + a + " / " + b + " = " + preciseDivision);
        
        System.out.println("\n=== Comparison Operators ===");
        boolean isEqual = (a == b);
        boolean isGreater = (a > b);
        boolean isLess = (a < b);
        boolean isNotEqual = (a != b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLessOrEqual = (a <= b);
        
        System.out.println(a + " == " + b + ": " + isEqual);
        System.out.println(a + " > " + b + ": " + isGreater);
        System.out.println(a + " < " + b + ": " + isLess);
        System.out.println(a + " != " + b + ": " + isNotEqual);
        System.out.println(a + " >= " + b + ": " + isGreaterOrEqual);
        System.out.println(a + " <= " + b + ": " + isLessOrEqual);
        
        System.out.println("\n=== Logical Operators ===");
        boolean andResult = (a > 5) && (b < 10);
        boolean orResult = (a > 15) || (b < 3);
        boolean notResult = !isTrue;
        boolean xorResult = (a > 5) ^ (b > 10);
        
        System.out.println("(a > 5) && (b < 10): " + andResult);
        System.out.println("(a > 15) || (b < 3): " + orResult);
        System.out.println("!isTrue: " + notResult);
        System.out.println("(a > 5) ^ (b > 10): " + xorResult);
        
        System.out.println("\n=== String Operations ===");
        String firstName = "john";
        String lastName = "doe";
        StringBuilder nameBuilder = new StringBuilder(firstName);
        nameBuilder.append(" ").append(lastName);
        String fullName = nameBuilder.toString();
        int nameLength = fullName.length();
        String upperName = fullName.toUpperCase();
        String lowerName = fullName.toLowerCase();
        String substring = fullName.substring(0, 4);
        boolean contains = fullName.contains("john");
        String replaced = fullName.replace("john", "John");
        String trimmed = fullName.trim();
        
        System.out.println("full name: " + fullName);
        System.out.println("length: " + nameLength);
        System.out.println("uppercase: " + upperName);
        System.out.println("lowercase: " + lowerName);
        System.out.println("substring(0,4): " + substring);
        System.out.println("contains 'john': " + contains);
        System.out.println("replaced: " + replaced);
        System.out.println("equals check: " + fullName.equals("john doe"));
        System.out.println("equalsIgnoreCase: " + fullName.equalsIgnoreCase("JOHN DOE"));
        
        System.out.println("\n=== Type Casting ===");
        int integer = 100;
        double doubleNumber = integer;
        float floatNumber = (float) doubleNumber;
        int backToInt = (int) doubleNumber;
        byte byteCast = (byte) integer;
        char charFromInt = (char) 65;
        
        System.out.println("int (" + integer + ") to double: " + doubleNumber);
        System.out.println("double to float: " + floatNumber);
        System.out.println("double to int: " + backToInt);
        System.out.println("int to byte: " + byteCast);
        System.out.println("int 65 to char: " + charFromInt);
        
        String numberString = "123";
        int parsedInt = Integer.parseInt(numberString);
        double parsedDouble = Double.parseDouble("45.67");
        System.out.println("String '123' to int: " + parsedInt);
        System.out.println("String '45.67' to double: " + parsedDouble);
        
        System.out.println("\n=== Compound Assignment Operators ===");
        int originalA = a;
        int originalB = b;
        a += 5;
        b -= 2;
        product *= 2;
        quotient /= 2;
        int modValue = 20;
        modValue %= 7;
        
        System.out.println("a (" + originalA + ") += 5: " + a);
        System.out.println("b (" + originalB + ") -= 2: " + b);
        System.out.println("product *= 2: " + product);
        System.out.println("quotient /= 2: " + quotient);
        System.out.println("20 %= 7: " + modValue);
        
        System.out.println("\n=== Bitwise Operations ===");
        int x = 5;
        int y = 3;
        StringBuilder bitwiseOutput = new StringBuilder();
        bitwiseOutput.append("x = ").append(x).append(" (binary: ").append(Integer.toBinaryString(x)).append(")\n");
        bitwiseOutput.append("y = ").append(y).append(" (binary: ").append(Integer.toBinaryString(y)).append(")\n");
        
        int andResult = x & y;
        int orResult = x | y;
        int xorResult = x ^ y;
        int notResult = ~x;
        int leftShift = x << 1;
        int rightShift = x >> 1;
        
        bitwiseOutput.append("x & y (AND): ").append(andResult).append(" (binary: ").append(Integer.toBinaryString(andResult)).append(")\n");
        bitwiseOutput.append("x | y (OR): ").append(orResult).append(" (binary: ").append(Integer.toBinaryString(orResult)).append(")\n");
        bitwiseOutput.append("x ^ y (XOR): ").append(xorResult).append(" (binary: ").append(Integer.toBinaryString(xorResult)).append(")\n");
        bitwiseOutput.append("~x (NOT): ").append(notResult).append(" (binary: ").append(Integer.toBinaryString(notResult)).append(")\n");
        bitwiseOutput.append("x << 1 (left shift): ").append(leftShift).append("\n");
        bitwiseOutput.append("x >> 1 (right shift): ").append(rightShift);
        System.out.println(bitwiseOutput.toString());
    }
}
