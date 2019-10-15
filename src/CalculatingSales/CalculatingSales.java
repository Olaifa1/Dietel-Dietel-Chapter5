package CalculatingSales;

import java.util.Scanner;
public class CalculatingSales {
	
	private int sales;
	private int compoundInterest;
	private int asterick;

	
	
	public CalculatingSales() {
		}

	public void sales() {
		
		int product = 0;
		int quantity = 0;
		double price1 = 0;
		double price2 = 0;
		double price3 = 0;
		double price4 = 0;
		double price5 = 0;
		while(product != -1 || quantity != -1) {
			System.out.print("Enter the Product number or -1 to terminate: ");
			Scanner input = new Scanner(System.in);
			product = input.nextInt();
			
			System.out.print("Enter Quantity Sold or -1 to terminate: ");
			quantity = input.nextInt();
		
		
		switch(product) {
		case 1:
			price1  = price1 + (2.98 * quantity);
			break;
		case 2:
			  price2  = price2 + (4.50 * quantity);
			break;
		case 3:
			  price3  = price3 + (9.98 * quantity);
			break;
		case 4:
			  price4  = price4 + (4.49 * quantity);
			break;
		case 5:
			 price5  =  price5 + (6.87 * quantity);
			break;
//		default:
//				System.out.print("This is Invalid");
//				break;
		}
		}
		double totalSales = price1 + price2 + price3 + price4 + price5;
		System.out.printf("The Total Sales: $%f", totalSales);
		}
	
	public void compoundInterest(){
		int year = 0;
		double amount = 0;
		double rate = 0.05;
		double principle = 0;
		for(int counter = 1; counter <= year; counter++) {
			amount = principle * Math.pow((1 + rate), year);
		}
	}
	
}