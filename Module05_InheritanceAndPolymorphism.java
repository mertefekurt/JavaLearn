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

