package diego_aula_07_05;

import java.util.Scanner;

public class operador_ternario3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Informe a primeira nota: ");
		nota1 = ler.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = ler.nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		nota3 = ler.nextDouble();
		
		System.out.println("Informe a quarta nota: ");
		nota4 = ler.nextDouble();
		
		media = (nota1+nota2+nota3+nota4) / 4;
		
		String resultado = media >= 6 ? "Aprovado" : "Reprovado";
		
		System.out.println("Você está: " + resultado);
		
		ler.close();
		
	}

}
