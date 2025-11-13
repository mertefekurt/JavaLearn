public class Module05_InheritanceAndPolymorphism {
    public static void main(String[] args) {
        Animal animal1 = new Dog("Buddy");
        Animal animal2 = new Cat("Whiskers");
        
        animal1.makeSound();
        animal2.makeSound();
        
        Dog dog = new Dog("Max");
        dog.makeSound();
        dog.fetch();
        
        Cat cat = new Cat("Fluffy");
        cat.makeSound();
        cat.climb();
        
        Animal[] animals = {new Dog("Rex"), new Cat("Mittens")};
        for (Animal animal : animals) {
            animal.makeSound();
        }
        
        System.out.println("\n=== Method Overriding and Super ===");
        Bird bird = new Bird("Tweety");
        bird.makeSound();
        bird.fly();
        
        System.out.println("\n=== Instanceof and Type Casting ===");
        Animal animal3 = new Dog("Max");
        if (animal3 instanceof Dog) {
            Dog dog3 = (Dog) animal3;
            dog3.fetch();
        }
        
        System.out.println("\n=== Abstract Methods ===");
        Shape circle = new CircleShape(5.0);
        Shape rectangle = new RectangleShape(4.0, 6.0);
        
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());
        circle.display();
        
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
        rectangle.display();
        
        System.out.println("\n=== Final Keyword ===");
        FinalClass finalObj = new FinalClass("Immutable");
        System.out.println("Final class value: " + finalObj.getValue());
    }
}

class Animal {
    protected String name;
    
    Animal(String name) {
        this.name = name;
    }
    
    void makeSound() {
        System.out.println(name + " makes a sound");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    
    @Override
    void makeSound() {
        System.out.println(name + " barks");
    }
    
    void fetch() {
        System.out.println(name + " fetches the ball");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
    
    @Override
    void makeSound() {
        System.out.println(name + " meows");
    }
    
    void climb() {
        System.out.println(name + " climbs the tree");
    }
}

class Bird extends Animal {
    Bird(String name) {
        super(name);
    }
    
    @Override
    void makeSound() {
        super.makeSound();
        System.out.println(name + " also chirps");
    }
    
    void fly() {
        System.out.println(name + " is flying");
    }
}

abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
    
    void display() {
        System.out.println("This is a shape");
    }
}

class CircleShape extends Shape {
    private double radius;
    
    CircleShape(double radius) {
        this.radius = radius;
    }
    
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    
    @Override
    void display() {
        System.out.println("This is a circle with radius " + radius);
    }
}

class RectangleShape extends Shape {
    private double width;
    private double height;
    
    RectangleShape(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    double calculateArea() {
        return width * height;
    }
    
    @Override
    double calculatePerimeter() {
        return 2 * (width + height);
    }
    
    @Override
    void display() {
        System.out.println("This is a rectangle " + width + " x " + height);
    }
}

final class FinalClass {
    private final String value;
    
    FinalClass(String value) {
        this.value = value;
    }
    
    String getValue() {
        return value;
    }
}

