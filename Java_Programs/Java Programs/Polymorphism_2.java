/*Write a Java program to create a base class Shape with a method called calculateArea(). Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea() method in each subclass to calculate and return the shape's area.

 */
class Shape {
   
    public double calculateArea() {
        return 0;
    }
}




class Circle extends Shape {

    
    private double radius;

    
    public Circle(double radius) {
        
        this.radius = radius;
    }

   
    public double calculateArea() {
        
        return Math.PI * radius * radius;
    }
} 


class Rectangle extends Shape {

    private double width;
    private double height;

    
    public Rectangle(double width, double height) {
        
        this.width = width;
        
        this.height = height;
    }

    
    public double calculateArea() {
       
        return width * height;
    }
} 



 class Triangle extends Shape {


    private double base;
    private double height;

   
    public Triangle(double base, double height) {
      
        this.base = base;
       
        this.height = height;
    }

  
  
    public double calculateArea() {
        
        return 0.5 * base * height;
    }
}

public class Polymorphism_2{

   
    public static void main(String[] args) {

        
        Circle circle = new Circle(4);
        
        System.out.println("Area of Circle: " + circle.calculateArea());

       
        Rectangle rectangle = new Rectangle(12, 34);
        
        System.out.println("\nArea of Rectangle: " + rectangle.calculateArea());

        
        Triangle triangle = new Triangle(5, 9);
        
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
} 