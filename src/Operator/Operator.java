package Operator; // To Collect two operands and an operator from user and calculate bsed on the operation passed.

import java.util.Scanner;
public class Operator {
	
	private double operation;
	
	
	
		public double operation() {
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter First Operand: ");
			int firstOperand = input.nextInt();
			
			System.out.print("Enter Second Operand: ");
			int secondOperand = input.nextInt();
			
			System.out.print("Enter Operator: ");
			char operator = input.next().charAt(0);
			
			
				
			int	result	= 0;
			switch (operator){
				case '+':
					result = firstOperand + secondOperand;
				
				case '-':
					result = firstOperand - secondOperand;
				break;
				
				case '*':
					result = firstOperand * secondOperand;
				break;
				
				case '/':
					result = firstOperand / secondOperand;
				break;
				
				default:
					System.out.println("Not a valid operation");
					break;
				
					
			}
			System.out.printf("The result is %d", result);	
			return result;
		}	
}
