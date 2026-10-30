package teste;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		//Declarando Variáveis
		double a, b, som, div, mult, sub;
		
		//Instanciar classe scanner
		Scanner ler = new Scanner (System.in);
		
		//Entrada de dados 
		System.out.println ("Informe o primeiro valor: ");
		a = ler.nextDouble();
		
		System.out.println ("Informe o segundo valor: ");
		System.out.println();
		b = ler.nextDouble();
		
		//Processamento
		som = a+b;
		div = a/b;
		mult = a*b;
		sub = a-b;
		
		//Exibir
		
		System.out.println ("A soma é: " + som);
		System.out.println ("A divisão é: " + div);
		System.out.println ("A multiplicação é: " + mult);
		System.out.println ("A subtração é: " + sub);
		
	}

}
