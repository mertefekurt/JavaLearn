public class Module03_MethodsAndClasses {
    
    static void greet() {
        System.out.println("hello!");
    }
    
    static void greet(String name) {
        System.out.println("hello " + name + "!");
    }
    
    static int add(int a, int b) {
        return a + b;
    }
    
    static int multiply(int a, int b) {
        return a * b;
    }
    
    public static void main(String[] args) {
        greet();
        greet("alice");
        
        int result = add(15, 25);
        System.out.println("sum: " + result);
        
        int product = multiply(5, 8);
        System.out.println("product: " + product);
        
        Student student1 = new Student("alice", 20);
        student1.showInfo();
        
        Student student2 = new Student("bob", 22);
        student2.showInfo();
        
        Student student3 = new Student("charlie", 19);
        student3.showInfo();
    }
}

class Student {
    String name;
    int age;
    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void showInfo() {
        System.out.println("name: " + name + ", age: " + age);
    }
}
