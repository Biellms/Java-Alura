package Alura;

public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println(" Testando condicionais\n");
		
		int idade = 12;
		int quantPessoas = 8;
		
		if (idade>=18) {
			System.out.println(" Voc� � MAIOR de idade!!\n Seja Bem Vindo!!");
		} else { if (quantPessoas < 10) {
			System.out.println(" Voc� pode entrar pois n�o h� membros suficientes!!");
		} else {
			System.out.println(" Voc� � MENOR de idade!! \n N�o pode entrar!!");
			}
		}
	}
}


