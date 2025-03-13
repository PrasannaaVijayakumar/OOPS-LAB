import java.util.*;
import java.lang.System;

public class Loan {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the value for Salary:");
        int Salary=scan.nextInt();
        System.out.print("Enter the value for age:");
        int age=scan.nextInt();
        if(age>=25 || Salary>=20000)
        {
            System.out.println("Loan is eligible");
            System.out.print("Enter the value for Loan:");

            int Loan=scan.nextInt();

            if(Loan<=50000){
                System.out.println("Loan is approved");
            }
            else{
                System.out.println("Loan is not approved");
            }
        }
        else{
            System.out.println("Loan is not approved");
        }

        
    }
    
}
