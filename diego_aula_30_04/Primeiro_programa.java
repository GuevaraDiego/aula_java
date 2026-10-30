package diego_aula_30_04;

import java.util.Scanner;

public class Primeiro_programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor 1 ");
		int valor1 = ler.nextInt();
		
		System.out.println("Informe o valor 2 ");
		int valor2 = ler.nextInt();
		
		int soma = valor1 + valor2;
		
		System.out.println("O resultado da soma é: " + soma);
		
	}

}
