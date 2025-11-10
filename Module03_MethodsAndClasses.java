public class Module03_MethodsAndClasses {
    
    static int counter = 0;
    
    static void greet() {
        System.out.println("hello!");
        counter++;
    }
    
    static void greet(String name) {
        System.out.println("hello " + name + "!");
        counter++;
    }
    
    static int add(int a, int b) {
        return a + b;
    }
    
    static int subtract(int a, int b) {
        return a - b;
    }
    
    static int multiply(int a, int b) {
        return a * b;
    }
    
    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("error: division by zero");
            return 0;
        }
        return a / b;
    }
    
    static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
    
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    static void displayCounter() {
        System.out.println("greet called " + counter + " times");
    }
    
    public static void main(String[] args) {
        greet();
        greet("alice");
        greet("bob");
        
        int sum = add(15, 25);
        System.out.println("sum: " + sum);
        
        int diff = subtract(30, 12);
        System.out.println("difference: " + diff);
        
        int product = multiply(5, 8);
        System.out.println("product: " + product);
        
        double quotient = divide(20.0, 4.0);
        System.out.println("quotient: " + quotient);
        
        int powerResult = power(2, 5);
        System.out.println("2^5: " + powerResult);
        
        int fact = factorial(5);
        System.out.println("5!: " + fact);
        
        displayCounter();
        
        Student student1 = new Student("alice", 20);
        student1.showInfo();
        student1.setAge(21);
        System.out.println("updated age: " + student1.getAge());
        
        Student student2 = new Student("bob", 22);
        student2.showInfo();
        
        Student student3 = new Student("charlie");
        student3.showInfo();
        student3.setAge(19);
        student3.showInfo();
        
        System.out.println("total students: " + Student.getTotalCount());
    }
}

class Student {
    private String name;
    private int age;
    private static int totalCount = 0;
    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        totalCount++;
    }
    
    Student(String name) {
        this.name = name;
        this.age = 0;
        totalCount++;
    }
    
    void showInfo() {
        System.out.println("name: " + name + ", age: " + age);
    }
    
    String getName() {
        return name;
    }
    
    void setName(String name) {
        this.name = name;
    }
    
    int getAge() {
        return age;
    }
    
    void setAge(int age) {
        this.age = age;
    }
    
    static int getTotalCount() {
        return totalCount;
    }
    
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
