package CompoundInterest;
// Solving Counpound Interest Using FOR LOOP With Rate = 9%

import java.util.Scanner;
public class CompoundInterest{
	private double amount;
	
	public double amount() {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Principal: ");
		double principal = input.nextDouble();
		System.out.print("Enter Number Of Years: ");
		int years = input.nextInt();
		double rate = 0.05;
		double amount = 0.0;
		double amount1 = 0.0;
		double amount2 = 0.0;
		double amount3 = 0.0;
		double amount4 = 0.0;
		double amount5 = 0.0;
		double amount6 = 0.0;
		for(int i = 1; i <= years ; i++) {
			for(int counter = 1; counter <= 1; counter++) { 
			 amount = principal * Math.pow(1.0 + 0.05,  i);
			 System.out.printf("The Compound Interest In year %d for %dpercent is: %.4f %n ", i, 5, amount);
			 amount1 = principal * Math.pow(1.0 + 0.06, i);
			 System.out.printf("The Compound Interest In year %d for %dpercent is: %.4f %n ", i, 6, amount1);
			 amount2 = principal * Math.pow(1.0 + 0.07, i);
			 System.out.printf("The Compound Interest In year %d for %dpercent is: %.4f %n ", i, 7, amount2);
			 amount3 = principal * Math.pow(1.0 + 0.08, i);
			 System.out.printf("The Compound Interest In year %d for %dpercent is: %.4f %n ", i, 8, amount3);
			 amount4 = principal * Math.pow(1.0 + 0.09, i);
			 System.out.printf("The Compound Interest In year %d for %dpercent is: %.4f %n ", i, 9, amount4);
			 amount5 = principal * Math.pow(1.0 + 1.0,  i);
			 System.out.printf("The Compound Interest In year %d for %dpercent is: %.4f %n ", i, 10, amount5);
			}
		}
		return  amount;
	}
}