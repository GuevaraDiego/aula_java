package diego_aula_27_08;

import java.util.Scanner;

public class Dois_Vetores {

	public static void main(String[] args) {
		int a[]  = new int[5];
		int b[]  = new int[5];
	// ver essa função	int c[]  = new int[a + b];

		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um número para A " + i+ "...:");
			a[i]= ler.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um número para B " + i+ "...:");
			b[i]= ler.nextInt();
		}
		
				
	//	System.out.println(+c[]);
				
	}
}
