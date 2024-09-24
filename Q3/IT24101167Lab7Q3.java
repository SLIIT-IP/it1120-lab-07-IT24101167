import java.util.Scanner;

public class IT24101167Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        final double DISCOUNT_RATE = 0.05; 
        
       
        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("Enter total bill amount for Customer " + customer + ": ");
            double billAmount = scanner.nextDouble();
            
            System.out.println("Enter payment mode for Customer " + customer + " (C/c for Cash, O/o for Other): ");
            char paymentMode = scanner.next().charAt(0);
            
           
            double finalAmount = billAmount;
            
            if (paymentMode == 'C' || paymentMode == 'c') {
             
                double discount = billAmount * DISCOUNT_RATE;
                finalAmount = billAmount - discount;
                System.out.println("Discount: $" + discount);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                
                System.out.println("No discount applied.");
            } else {
                System.out.println("Payment Mode is Not Valid.");
                continue; 
            }
            
          
            System.out.println("Amount to be paid: $" + finalAmount);
            System.out.println(); 
        }
        
        scanner.close();
    }
}
