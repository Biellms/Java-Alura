package Alura;

public class TestaBoolean {
    public static void main(String[] args) {
    	
        System.out.println(" Testando condicionais");

        int idade = 18;
        int quantidadePessoas = 2;

        boolean acompanhado;

        if (quantidadePessoas >= 2) {
            acompanhado = true;
        } else { acompanhado = false; }

        System.out.println("\n Valor de acompanhado = " + acompanhado + "\n");

        if (idade >= 18 ) {
            System.out.println(" Voc� � maior de Idade\n Seja bem vindo!");
        } else if (acompanhado) {
            System.out.println(" Voc� � menor de idade, mas est� acompanhado!!\n Seja bem vindo!!");
        }
        else {
            System.out.println(" Infelizmente voc� n�o pode entrar!!");
        }
    }
}