import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class builtin {
    public static void main(String[] args) {
        try {
            // Writing to file
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello, Prasannaa VijayaKumar!");
            writer.close();

            // Reading from file
            FileReader reader = new FileReader("sample.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}