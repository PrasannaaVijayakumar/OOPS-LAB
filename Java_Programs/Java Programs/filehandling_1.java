import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filehandling_1 {
    public static void main(String[] args) {
        try {
            File file = new File("example1.txt");

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Writing to the file
            FileWriter writer = new FileWriter("example1.txt");
            writer.write("Hello, Prasannaa VijayaKumar! This is a sample text file created using Java.");
            writer.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
