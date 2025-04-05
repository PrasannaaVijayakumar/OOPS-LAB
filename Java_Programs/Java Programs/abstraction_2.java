/*Write a Java program to create an abstract class Instrument with abstract methods play() and tune(). 
Create subclasses for Glockenspiel and Violin that extend the Instrument class and implement the respective methods to play and tune each instrument. */

abstract class Instrument {

    public abstract void play();
    public abstract void tune();
  }
  

  class Glockenspiel extends Instrument {
    

    public void play() {
     
      System.out.println("Glockenspiel: Playing the notes on the metal bars.");
    }
  
    
    public void tune() {
     
      System.out.println("Glockenspiel: Tuning the metal bars to the correct pitch.");
    }
  } 
 
  class Violin extends Instrument {
   
    public void play() {
     
      System.out.println("Violin: Playing the strings with a bow or fingers.");
    }
  
   
    public void tune() {
      
      System.out.println("Violin: Tuning the strings to the correct pitch.");
    }
  }
  
  public class abstraction_2 {
    
    public static void main(String[] args) {
     
      Instrument glockenspiel = new Glockenspiel();
      
      Instrument violin = new Violin();
  
      glockenspiel.play();
    
      glockenspiel.tune();

      violin.play();
      
      violin.tune();
    }
  } 