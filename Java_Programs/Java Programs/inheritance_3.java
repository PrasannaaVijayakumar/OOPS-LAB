/*Write a Java program to create a class called Animal with a method makeSound().

Create a subclass Mammal that inherits from Animal and adds a method walk().

Then, create another subclass Dog that inherits from Mammal and overrides makeSound() to print "Bark".

Demonstrate the use of multilevel inheritance in the main() method by creating a Dog object and calling all the methods.

 */


class Animal{
    public void makeSound(){
        System.out.println("Animal makes sound");
    }
}


class Mammal extends Animal{
    public void walk(){
        System.out.println("Mammal walks");
    }

}

class Dog extends Mammal{
   
    public void makeSound(){
        System.out.println("Bark");
    }

    public void walk(){
        System.out.println("Dog walks");
    }

}

public class inheritance_3 {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.walk();

    }
    
}
