/*Create a Java program demonstrating multilevel inheritance with the following hierarchy:

Class Vehicle → Contains a method startEngine().

Class Car (inherits Vehicle) → Adds a method drive().

Class SportsCar (inherits Car) → Overrides drive() to print "SportsCar is driving at high speed!". */


import java.util.Scanner;
class Vehicle{
    public void startEngine(){
        System.out.println("Engine started");
    }
}

class Car extends
Vehicle{
    public void drive(){
        System.out.println("Car is driving");
    }
}

class SportsCar extends Car{
    public void drive(){
        System.out.println("SportsCar is driving at high speed!");
    }
}



public class inheritance_4 {
    public static void main(String args[]){
        SportsCar mySportsCar = new SportsCar();
        mySportsCar.startEngine();
        mySportsCar.drive();
    }
}
