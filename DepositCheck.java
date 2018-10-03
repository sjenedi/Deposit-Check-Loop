/**
 * @author Sami Jenedi
 * This program will process bank account checks and prevent a negative balance.
 */
import java.util.Scanner;

public class DepositCheck {
	   public static void main(String[] args) {
      
		Scanner input = new Scanner(System.in);
		double balance = 0;
		double amount = 0;
		
		System.out.print("Please enter a balance: $"); 
		balance = input.nextDouble();
		
			while ( amount != -1) {
							
				System.out.print("Please enter check amount (-1 to end): $"); 
				amount = input.nextDouble();						
				
				if (amount > balance) {
					System.out.println("Warning: Check will bounce. No transaction occurred."); 
				}			
				else if (amount < 0) {
					System.out.println("Final balance: $" + balance); 
					amount = -1;
				}			
				else  {
				balance = balance - amount;	
				System.out.println("Remaining balance: $" + balance); 
				}					
		  }			
	}
}
