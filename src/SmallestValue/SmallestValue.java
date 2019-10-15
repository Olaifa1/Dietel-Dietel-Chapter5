package SmallestValue;

import java.util.Scanner;

public class SmallestValue {
		
	
	
		public void smallestValue() {
					System.out.print("Enter Number: ");
					Scanner input = new Scanner(System.in);
					int number = input.nextInt();
					int smallest = number;
					
					 for(int counter = 1; counter <= 9; counter++){
						 System.out.print("Enter Number: ");
						  number = input.nextInt();
						  if(number <  smallest) 
								smallest = number;
							
					 }
				
				 System.out.printf("The Smallest Number is %d%n", smallest);
			
	}
}
