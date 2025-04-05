/*Write a Java program to create a vehicle class hierarchy. 
The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. 
Each subclass should have properties such as make, model, year, and fuel type.
 Implement methods for calculating fuel efficiency, distance traveled, and maximum speed. */

 import java.util.Scanner;
 class Vehicle {
    public String getType(String Type){
        return Type;
    } 
    public String getModel(String Model){
        return Model;
    }
    public String getfueltype(String fuel){
        return fuel;
    }

    public int getYear(int year){
        return year;
    }

    public String getMake(String make){
        return make;
    }
    
 }

 class Truck extends Vehicle{
    private String Type;
    private String Model;
    private String fuel;
    private int year;
    private String make;

    Truck(String Type,String Model,String fuel,int year,String make){
        this.Type=Type;
        this.Model=Model;
        this.fuel=fuel;
        this.year=year;
        this.make=make;
    }
 }
 class Car extends Vehicle{
    private String Type;
    private String Model;
    private String fuel;
    private int year;
    private String make;

    Car(String Type,String Model,String fuel,int year,String make){
        this.Type=Type;
        this.Model=Model;
        this.fuel=fuel;
        this.year=year;
        this.make=make;
    }

 }
 class MotorCycle extends Vehicle{
    private String Type;
    private String Model;
    private String fuel;
    private int year;
    private String make;

    MotorCycle(String Type,String Model,String fuel,int year,String make){
        this.Type=Type;
        this.Model=Model;
        this.fuel=fuel;
        this.year=year;
        this.make=make;
    }
 }
public class inheritance_6 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enetr the details of the Truck:");
        
        System.out.print("Enter the type:");
        String Type=scan.nextLine();
        System.out.println("Enter the Model:");
        String Model=scan.nextLine();
        System.out.println("Enter the fuel: ");
        String fuel=scan.nextLine();
       
        System.out.println("Enter the year: ");
        int year=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the company:");
        String make=scan.nextLine();
        Truck truck=new Truck(Type,Model,fuel,year,make);


       
        System.out.println(truck.getType(Type));
        System.out.println(truck.getModel(Model));
        System.out.println(truck.getfueltype(fuel));
        System.out.println(truck.getYear(year));
        System.out.println(truck.getMake(make));


        System.out.println("Enetr the details of the Car:");
        System.out.print("Enter the type:");
        String type=scan.nextLine();
        System.out.println("Enter the Model:");
        String model=scan.nextLine();
        System.out.println("Enter the fuel: ");
        String Fuel=scan.nextLine();
      
        System.out.println("Enter the year: ");
        int Year=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the company:");
        String Make=scan.nextLine();
        Car car=new Car(type,model,Fuel,Year,Make);
        System.out.println(car.getType(type));
        System.out.println(car.getModel(model));
        System.out.println(car.getfueltype(Fuel));
        System.out.println(car.getYear(Year));
        System.out.println(car.getMake(Make));



        System.out.println("Enetr the details of the Motor Cycle:");


        System.out.print("Enter the type:");
        String Typee=scan.nextLine();
        System.out.println("Enter the Model:");
        String Modell=scan.nextLine();
        System.out.println("Enter the fuel: ");
        String fuell=scan.nextLine();
    
        System.out.println("Enter the year: ");
        int yearr=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the company:");
        String makee=scan.nextLine();

       


        MotorCycle motorcycle=new MotorCycle(Typee,Modell,fuell,yearr,makee);
        System.out.println(motorcycle.getType(Typee));
        System.out.println(motorcycle.getModel(Modell));
        System.out.println(motorcycle.getfueltype(fuell));
        System.out.println(motorcycle.getYear(yearr));
        System.out.println(motorcycle.getMake(makee));
    

    }
    
}
