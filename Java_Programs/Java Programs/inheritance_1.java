/*Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.*/

import java.util.Scanner;

public class inheritance_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = scan.nextDouble();
        Circle myCircle = new Circle(radius); 
        System.out.println("Perimeter: " + myCircle.getPerimeter());
        System.out.println("Area: " + myCircle.getArea());
    }
}

class Shape {
    // Methods to be overridden
    public double getPerimeter() {
        return 0; 
    }

    public double getArea() {
        return 0; 
    }
}


class Circle extends Shape {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

 
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius; 
    }

  
    @Override
    public double getArea() {
        return Math.PI * radius * radius; 
}

// Main Class

}
