package diego_aula_13_08;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n, resultado = 1;
		
		System.out.print("Informe um número para calcular: " );
		n = ler.nextInt();
		
		for (int i = 1; i <= n; i ++ ) {
			resultado = resultado * i;
		}
		System.out.println("O resultado é: " + resultado );
		ler.close();
	}
	

}
