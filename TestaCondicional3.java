package Alura;

import java.util.Scanner;

public class TestaCondicional3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double salario;
		
		System.out.print("\n Digite o sal�rio: ");
		salario = leia.nextDouble();

        if(salario >= 1900.0 && salario <= 2800.0) {
            System.out.println(" A sua aliquota � de 7%");
            System.out.println(" Voc� pode deduzir at� R$ 142");
        }
        else if(salario >= 2800.01 && salario <= 3751.0) {
            System.out.println(" A sua aliquota � de 15%");
            System.out.println(" Voc� pode deduzir at� R$ 350");
        }
        else if(salario >= 3751.01 && salario <= 4664.0) {
            System.out.println(" A sua aliquota � de 22.5%");
            System.out.println(" Voc� pode deduzir at� R$ 636");
        }
        else {
        	System.out.println("\n Sal�rio incorreto para calculo de aliquota!!");
        }
	}
}
