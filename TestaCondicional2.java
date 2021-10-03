package Alura;

public class TestaCondicional2 {

	public static void main(String[] args) {
		
		System.out.println(" Testando condicionais\n");
		
		int idade = 12;
		int quantPessoas = 11;
		
		if (idade>=18 && quantPessoas <= 10) { // operador OU " || " e operador AND " && "
			System.out.println(" Seja Bem Vindo!!");
		} else {
			System.out.println(" Você não pode entrar!!");
		}
	}
}