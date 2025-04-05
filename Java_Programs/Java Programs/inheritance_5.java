
/*10. Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Manager, Developer, and Programmer. Each subclass should have properties such as name, address, salary, and job title. Implement methods for calculating bonuses, generating performance reports, and managing projects */


class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

   
    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.10; 
    }

    
    public void generatePerformanceReport() {
        System.out.println("Performance Report for: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
        System.out.println("Annual Bonus: $" + calculateBonus());
        System.out.println("-----------------------------");
    }
}


class Manager extends Employee {
    private int teamSize;

    
    public Manager(String name, String address, double salary, int teamSize) {
        super(name, address, salary, "Manager");
        this.teamSize = teamSize;
    }

   
  
    public double calculateBonus() {
        return salary * 0.20; // 20% bonus for Managers
    }


    public void manageProject(String projectName) {
        System.out.println(name + " is managing project: " + projectName);
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String address, double salary, String programmingLanguage) {
        super(name, address, salary, "Developer");
        this.programmingLanguage = programmingLanguage;
    }

   
    public double calculateBonus() {
        return salary * 0.15; 
    }

    
    public void developSoftware(String softwareName) {
        System.out.println(name + " is developing software: " + softwareName + " using " + programmingLanguage);
    }
}

class Programmer extends Employee {
    private String specialization;

    
    public Programmer(String name, String address, double salary, String specialization) {
        super(name, address, salary, "Programmer");
        this.specialization = specialization;
    }

    
    public double calculateBonus() {
        return salary * 0.12; 
    }

  
    public void writeCode() {
        System.out.println(name + " is writing code in " + specialization);
    }
}


public class inheritance_5{
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice Johnson", "New York, USA", 80000, 10);
        Developer dev = new Developer("Bob Smith", "California, USA", 60000, "Java");
        Programmer prog = new Programmer("Charlie Brown", "Texas, USA", 50000, "Backend Development");

        
        mgr.generatePerformanceReport();
        dev.generatePerformanceReport();
        prog.generatePerformanceReport();

       
        mgr.manageProject("AI Research");
        dev.developSoftware("E-commerce Platform");
        prog.writeCode();
    }
}
