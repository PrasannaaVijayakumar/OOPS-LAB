/*Write a Java program to create a base class Animal with methods move() and makeSound(). Create two subclasses Bird and Panthera. Override the move() method in each subclass to describe how each animal moves.
 Also, override the makeSound() method in each subclass to make a specific sound for each animal. */
// Animal.java
class Animal {  
    public void move() {  
        System.out.println("Animal moves"); 
    }

    public void makeSound() {  
        System.out.println("Animal makes a sound"); 
    }
} 


class Bird extends Animal {  
   
    public void move() {  
        System.out.println("Bird flies");  
    }

  
    public void makeSound() {
        System.out.println("Bird chirps"); 
    }
}

class Panthera extends Animal {
  
  
  public void move() {
   
    System.out.println("Panthera walks");
  }

 
  public void makeSound() {
    
    System.out.println("Panthera roars");
  }
}

public class overriding_1 {

   public static void main(String[] args) {
    
    Animal bird = new Bird();
    
    Animal panthera = new Panthera();

   
    performAction(bird);
    
    performAction(panthera);
  }

  
  public static void performAction(Animal animal) {
    
    animal.move();
    
    animal.makeSound();
  }
}