import java.util.Arrays;

public class Module02_ControlStructures {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("adult");
        } else {
            System.out.println("not adult");
        }
        
        String status = (age >= 18) ? "adult" : "minor";
        System.out.println("status: " + status);
        
        int score = 85;
        System.out.println(determineGrade(score));
        
        System.out.println("\n=== Switch Statement ===");
        int day = 3;
        String dayOutput = switch (day) {
            case 1 -> "monday";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            default -> "weekend";
        };
        System.out.println(dayOutput);
        
        System.out.println("\n=== Switch Expression (Java 14+) ===");
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Weekend";
        };
        System.out.println("Day name: " + dayName);
        
        System.out.println("\n=== Switch with Multiple Cases ===");
        int month = 2;
        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Fall";
            default -> "Invalid month";
        };
        System.out.println("Month " + month + " is in " + season);
        
        System.out.println("for loop:");
        StringBuilder forLoopOutput = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            forLoopOutput.append("number: ").append(i).append("\n");
        }
        System.out.print(forLoopOutput.toString());
        
        System.out.println("nested for loop:");
        StringBuilder nestedOutput = new StringBuilder();
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                nestedOutput.append(i).append(",").append(j).append(" ");
            }
            nestedOutput.append("\n");
        }
        System.out.print(nestedOutput.toString());
        
        System.out.println("for loop with break:");
        StringBuilder breakLoopOutput = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            breakLoopOutput.append("i: ").append(i).append("\n");
        }
        System.out.print(breakLoopOutput.toString());
        
        System.out.println("for loop with continue:");
        StringBuilder continueOutput = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            continueOutput.append("odd: ").append(i).append("\n");
        }
        System.out.print(continueOutput.toString());
        
        System.out.println("while loop:");
        int j = 1;
        StringBuilder whileOutput = new StringBuilder();
        while (j <= 3) {
            whileOutput.append("j: ").append(j).append("\n");
            j++;
        }
        System.out.print(whileOutput.toString());
        
        System.out.println("while loop with break:");
        int k = 1;
        StringBuilder breakWhileOutput = new StringBuilder();
        while (true) {
            if (k > 5) {
                break;
            }
            breakWhileOutput.append("k: ").append(k).append("\n");
            k++;
        }
        System.out.print(breakWhileOutput.toString());
        
        System.out.println("do-while loop:");
        int m = 1;
        StringBuilder doWhileOutput = new StringBuilder();
        do {
            doWhileOutput.append("m: ").append(m).append("\n");
            m++;
        } while (m <= 3);
        System.out.print(doWhileOutput.toString());
        
        System.out.println("enhanced for loop:");
        int[] numbers = {10, 20, 30, 40, 50};
        StringBuilder numbersOutput = new StringBuilder();
        for (int num : numbers) {
            numbersOutput.append("value: ").append(num).append("\n");
        }
        System.out.print(numbersOutput.toString());
        
        System.out.println("stream iteration:");
        StringBuilder streamOutput = new StringBuilder();
        Arrays.stream(numbers).forEach(num -> streamOutput.append("stream value: ").append(num).append("\n"));
        System.out.print(streamOutput.toString());
        
        System.out.println("labeled break:");
        StringBuilder labeledBreakOutput = new StringBuilder();
        outer: for (int i = 1; i <= 3; i++) {
            for (int n = 1; n <= 3; n++) {
                if (i == 2 && n == 2) {
                    break outer;
                }
                labeledBreakOutput.append("i: ").append(i).append(", n: ").append(n).append("\n");
            }
        }
        System.out.print(labeledBreakOutput.toString());
        
        System.out.println("\n=== Labeled Continue ===");
        StringBuilder labeledContinueOutput = new StringBuilder();
        outerLoop: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    continue outerLoop;
                }
                labeledContinueOutput.append("i: ").append(i).append(", j: ").append(j).append("\n");
            }
        }
        System.out.print(labeledContinueOutput.toString());
        
        System.out.println("\n=== Nested If-Else ===");
        int temperature = 25;
        String weather = "sunny";
        String weatherAdvice = getWeatherAdvice(temperature, weather);
        System.out.println(weatherAdvice);
        
        System.out.println("\n=== Ternary Operator Chain ===");
        int value = 75;
        String result = evaluatePerformance(value);
        System.out.println("Value " + value + " is: " + result);
    }

    private static String determineGrade(int score) {
        return switch (score / 10) {
            case 10, 9 -> "grade: A";
            case 8 -> "grade: B";
            case 7 -> "grade: C";
            case 6 -> "grade: D";
            default -> "grade: F";
        };
    }
    
    // extract weather advice logic to improve code organization
    private static String getWeatherAdvice(int temperature, String weather) {
        if (temperature > 30) {
            return "sunny".equals(weather) 
                ? "Very hot and sunny - stay indoors" 
                : "Hot but not sunny";
        } else if (temperature > 20) {
            return "Pleasant weather";
        } else {
            return "Cool weather";
        }
    }
    
    // extract ternary chain to improve readability and maintainability
    private static String evaluatePerformance(int value) {
        return value >= 90 ? "Excellent" :
               value >= 80 ? "Good" :
               value >= 70 ? "Average" :
               value >= 60 ? "Below Average" : "Poor";
    }
}
