package diego_aula_27_08;

import java.util.Scanner;

public class vetor_exemplo_nome {

	public static void main(String[] args) {
		String name[] = new String [5];
		
		Scanner ler = new Scanner(System.in);
		
		for (int i= 0; i < 5; i++){
			System.out.println("Escreva o nome: ");
			name[i] = ler.next();
		}
		
		for (int i = 0; i < 5; i++){
			System.out.println(name[i]);
		}
		ler.close();
	}

}
