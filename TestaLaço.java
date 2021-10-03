package Alura;

public class TestaLaço {

	public static void main(String[] args) throws InterruptedException {
		
		int i, j;
		
		for(j = 0; j < 20; j++) {
            for(i = 0; i <= j; i++) {
            		System.out.print("*"); 
            		Thread.sleep(100);
				}
            System.out.println();
		}
	}
}