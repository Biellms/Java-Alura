package Alura;

public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println(" Testando condicionais\n");
		
		int idade = 12;
		int quantPessoas = 8;
		
		if (idade>=18) {
			System.out.println(" Você é MAIOR de idade!!\n Seja Bem Vindo!!");
		} else { if (quantPessoas < 10) {
			System.out.println(" Você pode entrar pois não há membros suficientes!!");
		} else {
			System.out.println(" Você é MENOR de idade!! \n Não pode entrar!!");
			}
		}
	}
}


