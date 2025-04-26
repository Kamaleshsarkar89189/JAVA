// Write a program to implement multilevel inheritance


class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks on legs.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
public class Multi_Level_Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.eat(); 
        myDog.walk();
        myDog.bark(); 
    }
}
