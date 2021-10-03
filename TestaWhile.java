package Alura;

public class TestaWhile {
	
	public static void main(String[] args) throws InterruptedException {
		
		int contador = 1;
		
		while(contador <= 10) {
		    System.out.println(contador);
		    contador = contador + 1;
		    Thread.sleep(1000);
		}
	}
}
