import java.util.Scanner;

// Custom exception for invalid name
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

// Custom exception for invalid grade
class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class GradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        
        while (!isValid) {
            try {
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                validateName(name);
                
                System.out.print("Enter grade (0-100): ");
                int grade = Integer.parseInt(scanner.nextLine());
                validateGrade(grade);
                
                System.out.println("✅ Valid input! Name: " + name + ", Grade: " + grade);
                isValid = true;
                
            } catch (InvalidNameException | InvalidGradeException e) {
                System.err.println("❌ Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("❌ Error: Grade must be a number!");
            }
        }
        scanner.close();
    }
    
    // Validation for name (must not be empty and must be alphabetic)
    public static void validateName(String name) throws InvalidNameException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidNameException("Name cannot be empty.");
        }
        if (!name.matches("[a-zA-Z ]+")) {
            throw new InvalidNameException("Name must contain only letters and spaces.");
        }
    }

    // Validation for grade (0 to 100)
    public static void validateGrade(int grade) throws InvalidGradeException {
        if (grade < 0 || grade > 100) {
            throw new InvalidGradeException("Grade must be between 0 and 100.");
        }
    }
}
