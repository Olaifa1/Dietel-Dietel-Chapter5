package BarChart;

import java.util.Scanner;
public class BarChart {
	
	public void chart() {
		
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		for(counter = 0; counter < 5; counter++) {
				
		System.out.println("Enter any number between 1 and 31: ");
		int number = input.nextInt();
		if(number <= 1 || number >= 31) {
			System.out.print("Number is not valid");
		}
		else {
		for( int i = 1; i <= number; i++) {
			System.out.print('*'+ " ");
			}
		}
	}
	}	
	
	
}
