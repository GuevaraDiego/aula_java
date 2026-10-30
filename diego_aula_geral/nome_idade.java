package teste;

import java.util.Scanner;

public class nome_idade {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		
		//Instanciando classe
		Scanner ler = new Scanner (System.in);
		
		//Entrada de dados
		System.out.println("Informe seu nome completo:  ");
		nome = ler.nextLine();
		
		System.out.println("Informe sua idade:  ");
		idade = ler.nextInt();
		
		//Exibição
		System.out.println("Seu nome completo é:  " + nome + " e sua idade é: " + idade);
		ler.close();
		
		
	}

}
