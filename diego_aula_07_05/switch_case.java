package diego_aula_07_05;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		int num;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um número de 1 a 3: ");
		num = ler.nextInt();
		
		switch(num) {
		
		case 1:
			System.out.println("O número digitado é 1");
		break;
		case 2:
			System.out.println("O número digitado é 2");
		break;
		case 3:
			System.out.println("O número digitado é 3");
		break;
		
		default:
			System.out.println("Número inválido");
		ler.close();	
		
		}
				 
	}

}
