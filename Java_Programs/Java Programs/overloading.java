/*Constructor Overloading
Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:

One constructor takes title and author as parameters.
The other constructor takes title, author, and price as parameters.
Print the values of the variables for each constructor.
*/


public class overloading {
    private String title;
    private String author;
    private double price;

  
    public overloading() {
       
        this.title = "Unknown";
        
        this.author = "Unknown";
       
        this.price = 0.0;
    }

 
    public overloading(String title, String author) {
       
        this.title = title;
 
        this.author = author;
      
        this.price = 0.0;
    }


    public overloading(String title, String author, double price) {
     
        this.title = title;
      
        this.author = author;
  
        this.price = price;
    }


    public static void main(String[] args) {  
         overloading book1 = new overloading();
    
        System.out.println("Book1 Title: " + book1.title);
        System.out.println("Book1 Author: " + book1.author);
        System.out.println("Book1 Price: " + book1.price);

        overloading book2 = new overloading("Amatka", "Karin Tidbeck");
        
        System.out.println("Book2 Title: " + book2.title);
        System.out.println("Book2 Author: " + book2.author);
        System.out.println("Book2 Price: " + book2.price);
        overloading book3 = new overloading("Altered Carbon", "Richard K. Morgan", 18.99);
      
        System.out.println("Book3 Title: " + book3.title);
        System.out.println("Book3 Author: " + book3.author);
        System.out.println("Book3 Price: " + book3.price);
    }
}