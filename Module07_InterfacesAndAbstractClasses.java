public class Module07_InterfacesAndAbstractClasses {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        Vehicle motorcycle = new Motorcycle("Honda");
        
        car.start();
        car.stop();
        System.out.println("Car speed: " + car.getSpeed());
        
        motorcycle.start();
        motorcycle.stop();
        System.out.println("Motorcycle speed: " + motorcycle.getSpeed());
        
        Drawable circle = new Circle(5.0);
        Drawable rectangle = new Rectangle(4.0, 6.0);
        
        circle.draw();
        System.out.println("Circle area: " + circle.calculateArea());
        
        rectangle.draw();
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}

interface Drawable {
    void draw();
    double calculateArea();
}

abstract class Vehicle {
    protected String brand;
    protected int speed;
    
    Vehicle(String brand) {
        this.brand = brand;
        this.speed = 0;
    }
    
    abstract void start();
    abstract void stop();
    
    int getSpeed() {
        return speed;
    }
}

class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }
    
    @Override
    void start() {
        speed = 60;
        System.out.println(brand + " car started, speed: " + speed + " km/h");
    }
    
    @Override
    void stop() {
        speed = 0;
        System.out.println(brand + " car stopped");
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(String brand) {
        super(brand);
    }
    
    @Override
    void start() {
        speed = 80;
        System.out.println(brand + " motorcycle started, speed: " + speed + " km/h");
    }
    
    @Override
    void stop() {
        speed = 0;
        System.out.println(brand + " motorcycle stopped");
    }
}

class Circle implements Drawable {
    private double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Drawable {
    private double width;
    private double height;
    
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle: " + width + " x " + height);
    }
    
    @Override
    public double calculateArea() {
        return width * height;
    }
}

