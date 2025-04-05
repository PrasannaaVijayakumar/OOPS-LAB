public class Calculator {

    // Method 1: adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: adds two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method 3: adds three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 4: adds int and double
    public double add(int a, double b) {
        return a + b;
    }

    // Method 5: adds double and int (different order)
    public double add(double a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("add(int, int): " + calc.add(10, 20));
        System.out.println("add(double, double): " + calc.add(5.5, 4.5));
        System.out.println("add(int, int, int): " + calc.add(1, 2, 3));
        System.out.println("add(int, double): " + calc.add(5, 2.5));
        System.out.println("add(double, int): " + calc.add(3.5, 2));
    }
}
