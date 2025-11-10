public class Module02_ControlStructures {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("adult");
        } else {
            System.out.println("not adult");
        }
        
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
            default:
                System.out.println("other days");
        }
        
        System.out.println("for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("number: " + i);
        }
        
        System.out.println("while loop:");
        int j = 1;
        while (j <= 3) {
            System.out.println("j: " + j);
            j++;
        }
        
        System.out.println("do-while loop:");
        int k = 1;
        do {
            System.out.println("k: " + k);
            k++;
        } while (k <= 3);
    }
}
