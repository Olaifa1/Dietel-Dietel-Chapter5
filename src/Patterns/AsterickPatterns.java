package Patterns;

public class AsterickPatterns {
	public void asterick() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for(int k = 10; k > i; k--) {
					System.out.print(" ");
			}
			for(int l = 10; l > i; l--) {
				System.out.print('*');
				}
			for(int m = 25; m > 10; m--) {
				System.out.print(" ");
			}
			for(int n = 0; n <= i; n++) {
				System.out.print("*");
			}
			for(int o = 0; o <= i; o++) {
				System.out.print(" ");
			}
			for(int p = 10; p > i; p--) {
				System.out.print('*');
				}
			System.out.println();
			}
	}
	
	public void numberPatterns() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.printf("%d", j);
			}
			for(int k = 15; k > i; k--) {
					System.out.print(" ");
			}
			for(int l = 10; l > i; l--) {
				System.out.printf("%d", l);
				}
			for(int m = 25; m > 10; m--) {
				System.out.print(" ");
			}
			for(int n = 0; n <= i; n++) {
				System.out.printf("%d", n);
			}
			for(int o = 0; o <= i; o++) {
				System.out.print(" ");
			}
			for(int p = 10; p > i; p--) {
				System.out.printf("%d", p);
				}
			System.out.println();
			}
	}
	public void SquarePatterns() {
		for( int i = 4; i > 0; i--) {
			System.out.print('*' + " ");
			}
		System.out.println();
		for(int j =0; j < 2; j++) {
			for(int k = 0; k < 1; k++) {
				System.out.print('*' + "     " + '*');
				System.out.println();
				}	
		}	
	for( int l = 4; l > 0; l--) {
			System.out.print('*' + " ");
		}
	}
	
	public void DiamondPatterns() {
		for(int i = 0; i < 1; i++) {
			System.out.print("      " + '*'+"  "+'*');
			System.out.println();
			}	
		for(int j = 0; j < 1; j++) {
			System.out.print("    " + '*'+"      "+'*');
			System.out.println();
			}
		for(int k =0; k < 2; k++) {
			for(int l = 0; l < 1; l++) {
				System.out.print("  " + '*'+"          "+'*');
				System.out.println();
				}
		}
		for(int m = 0; m < 1; m++) {
			System.out.print("    " + '*'+"      "+'*');
			System.out.println();
			}
		for(int n = 0; n < 1; n++) {
			System.out.print("      " + '*'+"  "+'*');
			System.out.println();
			}	
	}
	public void diamondPatterns2() {
		for(int i = 0; i < 10; i++) {
			for(int j = 10; j > i; j--) {
				System.out.print(" ");
				}
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			for(int l = 0; l <= i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < 10; i++) {
			for(int o = 0; o <= i; o++) {
				System.out.print(" ");
			}
			for(int p = 10; p > i; p--) {
				System.out.print('*');
				}
			for(int l = 10; l > i; l--) {
				System.out.print('*');
				}
			System.out.println();
		}
	}

}
	

