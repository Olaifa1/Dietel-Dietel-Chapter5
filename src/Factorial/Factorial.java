 package Factorial;

public class Factorial {
	public void factorial() {
		
		long j = 1;
		
		System.out.println("number \t Factorial");
			for(int i = 1; i <= 20; i++) {
				System.out.print(i);
				 j = i * j;
				System.out.println("          "+ j);	
			}
				
	}
}
