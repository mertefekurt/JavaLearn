public class Module03_MethodsAndClasses {
    
    // method without parameters
    static void greet() {
        System.out.println("Hello!");
    }
    
    // method with parameters
    static void greet(String name) {
        System.out.println("Hello " + name + "!");
    }
    
    // method returning value
    static int add(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        // method calls
        greet();
        greet("Alice");
        
        int result = add(15, 25);
        System.out.println("Sum: " + result);
        
        // class instance
        Student student1 = new Student("Alice", 20);
        student1.showInfo();
        
        Student student2 = new Student("Bob", 22);
        student2.showInfo();
    }
}

// simple class example
class Student {
    String name;
    int age;
    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

