/*Create a Java program with the following structure:

Interface Printable → Defines a method printDetails().

Interface Scannable → Defines a method scanDocument().

Class Device → Implements Printable and Scannable and provides implementation for both methods.

Class MultiFunctionPrinter → Inherits Device and adds a method faxDocument().

Task:
Demonstrate hybrid inheritance where MultiFunctionPrinter uses both Printable and Scannable.

In the main() method, create an object of MultiFunctionPrinter and call all methods (printDetails(), scanDocument(), and faxDocument()).
*/


interface Printable {
    void printDetails();
}


interface Scannable {
    void scanDocument();
}


class Device implements Printable, Scannable {
    public void printDetails() {
        System.out.println("Printing document...");
    }

    public void scanDocument() {
        System.out.println("Scanning document...");
    }
}


class MultiFunctionPrinter extends Device {
    public void faxDocument() {
        System.out.println("Faxing document...");
    }
}


public class inheritance_7 {
    public static void main(String[] args) {
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        
        
        mfp.printDetails();
        mfp.scanDocument();
        mfp.faxDocument();
    }
}
