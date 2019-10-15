package Operator;

import java.util.Scanner;

public class SwitchMonth {
	private int operator;
	
	
	Scanner input = new Scanner(System.in);
	
	public double getOperator() {
		return operator;
	}



	public void setOperator() {
		
		
//		System.out.print("Enter Any Operand: ");
//		int operand = input.nextInt();
//		if(operand < 0) {
//			System.out.print("This is not valid");
//		}
//	
//		if(operand == 0) {
//			System.out.print("Sunday");
//		}
//		if(operand == 1) {
//			System.out.print("Monday");
//		}
//			
//		if(operand == 2) {
//			System.out.print("Tuesday");
//		}
//			
//		if(operand == 3) {
//			System.out.print("Wednesday");
//		}
//			
//		if(operand == 4) {
//			System.out.print("Thursday");
//		}
//			
//		if(operand == 5) {
//			System.out.print("Friday");
//		}
//			
//		if(operand == 6) {
//			System.out.print("Saturday");
//		}
//					
//		int result  = 0;
//	
//		int remainder = 0;
//		if(operand > 6) {
//			result = (operand / 7 + 1);
//			remainder = (operand % 7);
//			if (remainder == 0) {
//				System.out.printf("Sunday of week %d", result);
//			}
//			if (remainder == 1) {
//				System.out.printf("Monday of week %d", result);
//			}
//			if (remainder == 2) {
//				System.out.printf("Tuesday of week %d", result);
//			}
//			if (remainder == 3) {
//				System.out.printf("Wednesday of week %d", result);
//			}
//			if (remainder == 4) {
//				System.out.printf("Thursday of week %d", result);
//			}
//			if (remainder == 5) {
//				System.out.printf("Friday of week %d", result);
//			}
//			if (remainder == 6) {
//				System.out.printf("Saturday of week %d", result);
//			}
//		}
//		
		System.out.print("Enter Any Operand: ");
		int operand = input.nextInt();
		int week = 0;
	
	
		if(operand > 6) {
			week = (operand / 7) +1;
			operand = week % 7;
		}
		
		
		switch(operand) {
		case 0:
			System.out.printf("Sunday of week %d", week);
			break;
		case 1:
			System.out.printf("Monday of week %d", week);
			break;	
		case 2:
			System.out.printf("Tuesday of week %d", week);
			break;
		case 3:
			System.out.printf("Wednesday of week %d", week);
			break;	
		case 4:
			System.out.printf("Thursday of week %d", week);
			break;	
		case 5:
			System.out.printf("Friday of week %d", week);
			break;
		case 6:
			System.out.printf("Saturday of week %d", week);
			break;
		default:
			System.out.print("This is Invalid");
		}
		
		
	}




}
