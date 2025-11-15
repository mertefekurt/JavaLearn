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
        if (score >= 90) {
            System.out.println("grade: A");
        } else if (score >= 80) {
            System.out.println("grade: B");
        } else if (score >= 70) {
            System.out.println("grade: C");
        } else {
            System.out.println("grade: F");
        }
        
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
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("odd: " + i);
        }
        
        System.out.println("while loop:");
        int j = 1;
        while (j <= 3) {
            System.out.println("j: " + j);
            j++;
        }
        
        System.out.println("while loop with break:");
        int k = 1;
        while (true) {
            if (k > 5) {
                break;
            }
            System.out.println("k: " + k);
            k++;
        }
        
        System.out.println("do-while loop:");
        int m = 1;
        do {
            System.out.println("m: " + m);
            m++;
        } while (m <= 3);
        
        System.out.println("enhanced for loop:");
        int[] numbers = {10, 20, 30, 40, 50};
        StringBuilder numbersOutput = new StringBuilder();
        for (int num : numbers) {
            numbersOutput.append("value: ").append(num).append("\n");
        }
        System.out.print(numbersOutput.toString());
        
        System.out.println("labeled break:");
        outer: for (int i = 1; i <= 3; i++) {
            for (int n = 1; n <= 3; n++) {
                if (i == 2 && n == 2) {
                    break outer;
                }
                System.out.println("i: " + i + ", n: " + n);
            }
        }
        
        System.out.println("\n=== Labeled Continue ===");
        outerLoop: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    continue outerLoop;
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
        
        System.out.println("\n=== Nested If-Else ===");
        int temperature = 25;
        String weather = "sunny";
        if (temperature > 30) {
            if ("sunny".equals(weather)) {
                System.out.println("Very hot and sunny - stay indoors");
            } else {
                System.out.println("Hot but not sunny");
            }
        } else if (temperature > 20) {
            System.out.println("Pleasant weather");
        } else {
            System.out.println("Cool weather");
        }
        
        System.out.println("\n=== Ternary Operator Chain ===");
        int value = 75;
        String result = value >= 90 ? "Excellent" :
                       value >= 80 ? "Good" :
                       value >= 70 ? "Average" :
                       value >= 60 ? "Below Average" : "Poor";
        System.out.println("Value " + value + " is: " + result);
    }
}
