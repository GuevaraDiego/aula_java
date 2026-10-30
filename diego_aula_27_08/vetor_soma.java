package diego_aula_27_08;

import java.util.Scanner;

public class vetor_soma {

	public static void main(String[] args) {
	int a[]  = new int[5];
	int soma = 0;
	
		
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um número para A " + i+ "...:");
			a[i]= ler.nextInt();
			soma += a[i];
	
		}                   
            
		if (soma > 15 ) {
			
			System.out.println("A soma é: " +soma);
		}
				
		ler.close();
}

}


