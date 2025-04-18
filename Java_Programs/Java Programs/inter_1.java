/*Write a Java program to create an interface Flyable with a method called fly_obj().
 Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface. 
Implement the fly_obj() method for each of the three classes.*/ 




interface Flyable {
    
    void fly_obj();
}

class Spacecraft implements Flyable {
    
    public void fly_obj() {
        
        System.out.println("Spacecraft is flying");
    }
}


class Airplane implements Flyable {
    
    public void fly_obj() {
        
        System.out.println("Airplane is flying");
    }
}



class Helicopter implements Flyable {
    
    public void fly_obj() {
       
        System.out.println("Helicopter is flying");
    }
}


public class inter_1 {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Spacecraft(), new Airplane(), new Helicopter()};
        for (Flyable obj : flyingObjects) {
            obj.fly_obj();
        }
    }
}