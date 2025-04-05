/*You are designing a payment processing system with multiple functionalities. Implement the following:

Interface BankTransaction → Has a method processBankTransfer().

Interface CardTransaction → Has a method processCardPayment().

Class OnlinePaymentSystem → Implements both BankTransaction and CardTransaction, providing implementation for both methods.

Class ECommercePlatform → Inherits OnlinePaymentSystem and adds a method checkout() that combines bank transfers and card payments. */



interface BankTransaction {
    void processBankTransfer(double amount);
}

interface CardTransaction {
    void processCardPayment(double amount);
}


class OnlinePaymentSystem implements BankTransaction, CardTransaction {
    
    public void processBankTransfer(double amount) {
        System.out.println("Processing bank transfer of $" + amount);
    }

   
    public void processCardPayment(double amount) {
        System.out.println("Processing card payment of $" + amount);
    }
}

class ECommercePlatform extends OnlinePaymentSystem {
    public void checkout(String method, double amount) {
        if (method.equalsIgnoreCase("bank")) {
            processBankTransfer(amount);
        } else if (method.equalsIgnoreCase("card")) {
            processCardPayment(amount);
        } else {
            System.out.println("Invalid payment method selected.");
        }
    }
}


public class inheritance_8{
    public static void main(String[] args) {
        ECommercePlatform ecommerce = new ECommercePlatform();

        
        ecommerce.checkout("bank", 500);
        ecommerce.checkout("card", 200);
    }
}
