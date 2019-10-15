package OddIntegerProduct;

public class OddIntegerProduct {
		
	public void OddIntegerProduct() {
		int total = 1;
			for(int i = 1; i <= 15; i += 2) {
				total = total * i;
				}
			System.out.print(total);
			}
}
