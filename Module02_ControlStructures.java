public class Module02_ControlStructures {
    public static void main(String[] args) {
        // if-else structure
        int age = 18;
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not adult");
        }
        
        // switch-case
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other days");
        }
        
        // for loop
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
        
        // while loop
        System.out.println("While loop:");
        int j = 1;
        while (j <= 3) {
            System.out.println("J: " + j);
            j++;
        }
        
        // do-while loop
        System.out.println("Do-while loop:");
        int k = 1;
        do {
            System.out.println("K: " + k);
            k++;
        } while (k <= 3);
    }
}

