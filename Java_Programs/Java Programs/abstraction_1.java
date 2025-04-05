/*Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine().
 Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to start and stop the engines for each vehicle type. */


abstract class Vehicle {
  
    public abstract void startEngine();
  
    
    public abstract void stopEngine();
  } 
  
  class Car extends Vehicle {
  
    public void startEngine() {
     
      System.out.println("Car: Starting the engine...");
    }
  
   
    public void stopEngine() {
     
      System.out.println("Car: Stopping the engine...");
    }
  } 
 
  class Motorcycle extends Vehicle {
   
    public void startEngine() {
      
      System.out.println("Motorcycle: Starting the engine...");
    }
  
    public void stopEngine() {
      
      System.out.println("Motorcycle: Stopping the engine...");
    }
  } 
 
  public class abstraction_1 {
   
    public static void main(String[] args) {
    
      Vehicle car = new Car();
   
      Vehicle motorcycle = new Motorcycle();
  
  
      car.startEngine();

      car.stopEngine();
  
      motorcycle.startEngine();
      motorcycle.stopEngine();
    }
  } 