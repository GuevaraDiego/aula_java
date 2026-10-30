package diego_aula_03_09;

import java.util.Scanner;

public class junta_vetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int[5];
		int c[] = new int[10];
		
		//Bloco do for é entrada de dados para o vetor a e b
		
		for (int i=0; i<5; i++) {
			System.out.println("Informe um valor para o vetor A:  ");
			a[i] = ler.nextInt();
			
			System.out.println("Informe um valor para o vetor B:  ");
			b[i] = ler.nextInt();
		}
		
		//carregar vetor c
		for (int i=0; i<5; i++ ) {
			c[i] = a[i];
			c[i+5] = b[i];
		}
		
		//mostrar vetor c
		for (int i=0; i<10; i++) {
			System.out.println("Os valores do vetor C são:  " +c[i]);
		}
		

	}

}
