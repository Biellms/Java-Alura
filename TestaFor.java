package Alura;

public class TestaFor {

	public static void main(String[] args) throws InterruptedException {
		
		int i, j;
		
		for(j = 1; j <= 10; j++) {
            for(i = 0; i <= 10; i++) {
                System.out.print(j * i);
                System.out.print(" ");
			Thread.sleep(100);
			}
            System.out.println();
		}
	}
}