
class Animal {
    
    String name;

    
    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    
    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}


class Dog extends Animal {
    
    
    Dog(String name) {
        super(name); 
    }

    
    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class Inheri {
    public static void main(String[] args) {
        
        Dog d = new Dog("Leo");

        
        d.eat();
        d.sleep();

        
        d.bark();
    }
}
