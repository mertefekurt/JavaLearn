import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

import java.util.Arrays;

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
        
        StringBuilder primitiveOutput = new StringBuilder();
        primitiveOutput.append("byte: ").append(byteValue).append(" (range: -128 to 127)\n");
        primitiveOutput.append("short: ").append(shortValue).append(" (range: -32,768 to 32,767)\n");
        primitiveOutput.append("int: ").append(number).append(" (range: -2^31 to 2^31-1)\n");
        primitiveOutput.append("long: ").append(longValue).append(" (range: -2^63 to 2^63-1)\n");
        primitiveOutput.append("double: ").append(decimal).append(" (64-bit floating point)\n");
        primitiveOutput.append("float: ").append(floatValue).append(" (32-bit floating point)\n");
        primitiveOutput.append("char: ").append(character).append(" (Unicode character)\n");
        primitiveOutput.append("boolean: ").append(isTrue).append(" (true or false)\n");
        primitiveOutput.append("string: ").append(text).append(" (object type)");
        System.out.println(primitiveOutput.toString());
        
        System.out.println("\n=== Type Sizes ===");
        String[] primitiveNames = {"byte", "short", "int", "long", "float", "double"};
        int[] primitiveSizes = {Byte.BYTES, Short.BYTES, Integer.BYTES, Long.BYTES, Float.BYTES, Double.BYTES};
        StringBuilder sizeOutput = new StringBuilder();
        for (int i = 0; i < primitiveNames.length; i++) {
            sizeOutput.append(primitiveNames[i])
                    .append(" size: ")
                    .append(primitiveSizes[i])
                    .append(" bytes");
            if (i < primitiveNames.length - 1) {
                sizeOutput.append("\n");
            }
        }
        System.out.println(sizeOutput.toString());
        
        System.out.println("\n=== Arithmetic Operations ===");
        int a = 10;
        int b = 5;
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;
        
        StringBuilder arithmeticOutput = new StringBuilder();
        arithmeticOutput.append(a).append(" + ").append(b).append(" = ").append(sum).append("\n");
        arithmeticOutput.append(a).append(" - ").append(b).append(" = ").append(diff).append("\n");
        arithmeticOutput.append(a).append(" * ").append(b).append(" = ").append(product).append("\n");
        arithmeticOutput.append(a).append(" / ").append(b).append(" = ").append(quotient).append("\n");
        arithmeticOutput.append(a).append(" % ").append(b).append(" = ").append(remainder);
        System.out.println(arithmeticOutput.toString());
        
        double preciseDivision = (double) a / b;
        System.out.println("Precise division: " + a + " / " + b + " = " + preciseDivision);
        
        System.out.println("\n=== Array Statistics ===");
        int[] metrics = {sum, diff, product, quotient, remainder};
        int minMetric = metrics[0];
        int maxMetric = metrics[0];
        int totalMetrics = 0;
        for (int metric : metrics) {
            totalMetrics += metric;
            if (metric < minMetric) {
                minMetric = metric;
            }
            if (metric > maxMetric) {
                maxMetric = metric;
            }
        }
        double averageMetric = totalMetrics / (double) metrics.length;
        System.out.println("values: " + Arrays.toString(metrics));
        System.out.println("min: " + minMetric);
        System.out.println("max: " + maxMetric);
        System.out.println("average: " + averageMetric);
        
        System.out.println("\n=== Comparison Operators ===");
        boolean isEqual = (a == b);
        boolean isGreater = (a > b);
        boolean isLess = (a < b);
        boolean isNotEqual = (a != b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLessOrEqual = (a <= b);
        
        StringBuilder comparisonOutput = new StringBuilder();
        comparisonOutput.append(a).append(" == ").append(b).append(": ").append(isEqual).append("\n");
        comparisonOutput.append(a).append(" > ").append(b).append(": ").append(isGreater).append("\n");
        comparisonOutput.append(a).append(" < ").append(b).append(": ").append(isLess).append("\n");
        comparisonOutput.append(a).append(" != ").append(b).append(": ").append(isNotEqual).append("\n");
        comparisonOutput.append(a).append(" >= ").append(b).append(": ").append(isGreaterOrEqual).append("\n");
        comparisonOutput.append(a).append(" <= ").append(b).append(": ").append(isLessOrEqual);
        System.out.println(comparisonOutput.toString());
        
        System.out.println("\n=== Logical Operators ===");
        boolean andResult = (a > 5) && (b < 10);
        boolean orResult = (a > 15) || (b < 3);
        boolean notResult = !isTrue;
        boolean xorResult = (a > 5) ^ (b > 10);
        
        StringBuilder logicalOutput = new StringBuilder();
        logicalOutput.append("(a > 5) && (b < 10): ").append(andResult).append("\n");
        logicalOutput.append("(a > 15) || (b < 3): ").append(orResult).append("\n");
        logicalOutput.append("!isTrue: ").append(notResult).append("\n");
        logicalOutput.append("(a > 5) ^ (b > 10): ").append(xorResult);
        System.out.println(logicalOutput.toString());
        
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
        
        StringBuilder stringOpsOutput = new StringBuilder();
        stringOpsOutput.append("full name: ").append(fullName).append("\n");
        stringOpsOutput.append("length: ").append(nameLength).append("\n");
        stringOpsOutput.append("uppercase: ").append(upperName).append("\n");
        stringOpsOutput.append("lowercase: ").append(lowerName).append("\n");
        stringOpsOutput.append("substring(0,4): ").append(substring).append("\n");
        stringOpsOutput.append("contains 'john': ").append(contains).append("\n");
        stringOpsOutput.append("replaced: ").append(replaced).append("\n");
        stringOpsOutput.append("equals check: ").append(fullName.equals("john doe")).append("\n");
        stringOpsOutput.append("equalsIgnoreCase: ").append(fullName.equalsIgnoreCase("JOHN DOE"));
        System.out.println(stringOpsOutput.toString());
        
        System.out.println("\n=== Type Casting ===");
        int integer = 100;
        double doubleNumber = integer;
        float floatNumber = (float) doubleNumber;
        int backToInt = (int) doubleNumber;
        byte byteCast = (byte) integer;
        char charFromInt = (char) 65;
        
        StringBuilder castingOutput = new StringBuilder();
        castingOutput.append("int (").append(integer).append(") to double: ").append(doubleNumber).append("\n");
        castingOutput.append("double to float: ").append(floatNumber).append("\n");
        castingOutput.append("double to int: ").append(backToInt).append("\n");
        castingOutput.append("int to byte: ").append(byteCast).append("\n");
        castingOutput.append("int 65 to char: ").append(charFromInt);
        System.out.println(castingOutput.toString());
        
        String numberString = "123";
        int parsedInt = Integer.parseInt(numberString);
        double parsedDouble = Double.parseDouble("45.67");
        System.out.println("String '123' to int: " + parsedInt);
        System.out.println("String '45.67' to double: " + parsedDouble);
        
        // safe parsing with error handling
        String invalidNumber = "abc";
        try {
            int invalidInt = Integer.parseInt(invalidNumber);
            System.out.println("Parsed: " + invalidInt);
        } catch (NumberFormatException e) {
            System.out.println("Failed to parse '" + invalidNumber + "': " + e.getMessage());
        }
        
        System.out.println("\n=== Big Numbers ===");
        BigInteger bigInteger = new BigInteger("123456789012345678901234567890");
        BigInteger anotherBigInteger = new BigInteger("987654321098765432109876543210");
        BigInteger bigSum = bigInteger.add(anotherBigInteger);
        BigInteger bigProduct = bigInteger.multiply(BigInteger.TEN);
        System.out.println("BigInteger sum: " + bigSum);
        System.out.println("BigInteger * 10: " + bigProduct);
        
        BigDecimal price = new BigDecimal("19.99");
        BigDecimal discountRate = new BigDecimal("0.15");
        BigDecimal discountAmount = price.multiply(discountRate);
        BigDecimal finalPrice = price.subtract(discountAmount).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Original price: " + price);
        System.out.println("Discount amount: " + discountAmount);
        System.out.println("Final price: " + finalPrice);
        
        System.out.println("\n=== Compound Assignment Operators ===");
        int originalA = a;
        int originalB = b;
        a += 5;
        b -= 2;
        product *= 2;
        quotient /= 2;
        int modValue = 20;
        modValue %= 7;
        
        StringBuilder compoundOutput = new StringBuilder();
        compoundOutput.append("a (").append(originalA).append(") += 5: ").append(a).append("\n");
        compoundOutput.append("b (").append(originalB).append(") -= 2: ").append(b).append("\n");
        compoundOutput.append("product *= 2: ").append(product).append("\n");
        compoundOutput.append("quotient /= 2: ").append(quotient).append("\n");
        compoundOutput.append("20 %= 7: ").append(modValue);
        System.out.println(compoundOutput.toString());
        
        System.out.println("\n=== Math Utilities ===");
        double squareRoot = Math.sqrt(product);
        double powerValue = Math.pow(a, 3);
        int maxValue = Math.max(a, b);
        int minValue = Math.min(a, b);
        long roundedDecimal = Math.round(decimal);
        double randomValue = Math.random();
        System.out.println("sqrt(product): " + squareRoot);
        System.out.println("a^3: " + powerValue);
        System.out.println("max(a, b): " + maxValue);
        System.out.println("min(a, b): " + minValue);
        System.out.println("rounded decimal: " + roundedDecimal);
        System.out.println("random value (0-1): " + randomValue);
        
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
