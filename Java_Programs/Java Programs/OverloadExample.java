public class OverloadExample {

    // Method 1: accepts one int
    public void display(int a) {
        System.out.println("Method with int: " + a);
    }

    // Method 2: accepts one double
    public void display(double a) {
        System.out.println("Method with double: " + a);
    }

    // Method 3: accepts a String
    public void display(String str) {
        System.out.println("Method with String: " + str);
    }

    // Method 4: accepts varargs (int...)
    public void display(int... numbers) {
        System.out.print("Method with varargs: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();

        obj.display(10);             // int
        obj.display(5.5);            // double
        obj.display("Hello");        // String
        obj.display(1, 2, 3, 4, 5);  // varargs
    }
}
