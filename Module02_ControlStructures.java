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
        
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            default:
                System.out.println("weekend");
        }
        
        System.out.println("for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("number: " + i);
        }
        
        System.out.println("nested for loop:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + "," + j + " ");
            }
            System.out.println();
        }
        
        System.out.println("for loop with break:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println("i: " + i);
        }
        
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
        for (int num : numbers) {
            System.out.println("value: " + num);
        }
        
        System.out.println("labeled break:");
        outer: for (int i = 1; i <= 3; i++) {
            for (int n = 1; n <= 3; n++) {
                if (i == 2 && n == 2) {
                    break outer;
                }
                System.out.println("i: " + i + ", n: " + n);
            }
        }
    }
}
