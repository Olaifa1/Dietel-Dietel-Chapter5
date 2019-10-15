package SecureRandomNumber;

import java.security.SecureRandom;
public class SecureRandomNumber {

	SecureRandom randomNumber = new SecureRandom();
	public  void randomNumber() {
		
		for(int i = 1; i <= 20; i++) {
			int faceOfDie = 1 + randomNumber.nextInt(6);
			System.out.printf("%d", faceOfDie);
			if(i % 5 == 0) {
				System.out.println();
			}
		}
	}
	public void randomNumber2() {
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		int counter4 = 0;
		int counter5 = 0;
		int counter6 = 0;
		for(int roll =1; roll <= 60_000_000; roll++) {
			int faceOfDie = 1 + randomNumber.nextInt(6);
			
			switch(faceOfDie) {
			case 1:
				counter1++;
				break;
			case 2:
				counter2++;
				break;
			case 3:
				counter3++;
				break;
			case 4:
				counter4++;
				break;
			case 5:
				counter5++;
				break;
			case 6:
				counter6++;
				break;
			}
			
		}
		System.out.println("1 Appeared " + counter1 + " times");
		System.out.println("2 Appeared " + counter2 + " times");
		System.out.println("3 Appeared " + counter3 + " times");
		System.out.println("4 Appeared " + counter4 + " times");
		System.out.println("5 Appeared " + counter5 + " times");
		System.out.println("6 Appeared " + counter6 + " times");
	}

	
}
