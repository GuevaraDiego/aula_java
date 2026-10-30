package diego_aula_20_08;

import java.util.Scanner;

public class while_fatorial {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int fat = 1;
		int i = 1;
		
		
		System.out.println( "Informe o fatorial: ");
		int n = ler.nextInt();
		
		while (i <=n) {
			fat = fat * i;
			i++;
				}
		System.out.println("O fatorial é: " + fat);
		ler.close();
	}
	

}
