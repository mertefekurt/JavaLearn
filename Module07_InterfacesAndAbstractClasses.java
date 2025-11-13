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
        
        System.out.println("\n=== Default Methods in Interfaces ===");
        ModernVehicle car2 = new ModernCar("Tesla");
        car2.start();
        car2.honk();
        car2.stop();
        
        System.out.println("\n=== Multiple Interface Implementation ===");
        SmartDevice phone = new SmartPhone("iPhone");
        phone.turnOn();
        phone.connect();
        phone.turnOff();
        
        System.out.println("\n=== Static Methods in Interfaces ===");
        String info = Configurable.getDefaultConfig();
        System.out.println("Default config: " + info);
        
        Configurable device = new ConfigurableDevice();
        device.configure("Custom settings");
        System.out.println("Device configured: " + device.getConfiguration());
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

interface ModernVehicle {
    void start();
    void stop();
    
    default void honk() {
        System.out.println("Beep beep!");
    }
    
    default void emergencyStop() {
        System.out.println("Emergency stop activated!");
        stop();
    }
}

class ModernCar implements ModernVehicle {
    private String brand;
    
    ModernCar(String brand) {
        this.brand = brand;
    }
    
    @Override
    public void start() {
        System.out.println(brand + " car started");
    }
    
    @Override
    public void stop() {
        System.out.println(brand + " car stopped");
    }
}

interface Powerable {
    void turnOn();
    void turnOff();
}

interface Connectable {
    void connect();
    void disconnect();
}

class SmartDevice implements Powerable, Connectable {
    private String name;
    private boolean isOn = false;
    private boolean isConnected = false;
    
    SmartDevice(String name) {
        this.name = name;
    }
    
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(name + " turned on");
    }
    
    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(name + " turned off");
    }
    
    @Override
    public void connect() {
        isConnected = true;
        System.out.println(name + " connected");
    }
    
    @Override
    public void disconnect() {
        isConnected = false;
        System.out.println(name + " disconnected");
    }
}

class SmartPhone extends SmartDevice {
    SmartPhone(String name) {
        super(name);
    }
}

interface Configurable {
    void configure(String settings);
    String getConfiguration();
    
    static String getDefaultConfig() {
        return "Default configuration loaded";
    }
}

class ConfigurableDevice implements Configurable {
    private String configuration = "None";
    
    @Override
    public void configure(String settings) {
        this.configuration = settings;
    }
    
    @Override
    public String getConfiguration() {
        return configuration;
    }
}

