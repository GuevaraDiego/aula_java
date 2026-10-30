package diego_aula_07_05;

import java.util.Scanner;

public class operador_ternário {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.println("Informe a idade: ");
		idade  = ler.nextInt();
		
		String mensagem = idade >= 18 ? "Maior de idade" : "Menor de idade";
		
		System.out.println("A pessoa é: " + mensagem);
		
		ler.close();
		
	}

}
