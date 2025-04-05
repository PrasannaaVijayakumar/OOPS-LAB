import java.util.Scanner;

/*3. Write a Java program to create a class called Shape with a method called getArea().
 Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle. */

class Shape{

    public static int getArea(int x,int y){
        int area=0;
        return area;

    }


}

class Rectangle extends Shape{
    private static  int breadth;
    private static int length;

     Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;

    }
    public static int getArea(int breadth,int length){
        int area=breadth*length;
        return area;

    }

}



public class inheritance_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        int length=scan.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        int breadth=scan.nextInt();
        Rectangle object=new Rectangle(length,breadth);
        System.out.println("The area of the rectangle is "+object.getArea(length,breadth));
        scan.close();
       
        
    }
    
}
