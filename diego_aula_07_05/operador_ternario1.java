package diego_aula_07_05;

import java.util.Scanner;

public class operador_ternario1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Informe o primeiro número: ");
		num1 = ler.nextInt();
		
		System.out.println("Informe o segundo número: ");
		num2 = ler.nextInt();
		
		String resposta = num1 >= num2 ? "Primeiro número maior que o segundo" : "Segundo número maior que o primeiro";
		
		System.out.println(resposta);
		 ler.close();

	}

}
