package teste;
import java.util.Scanner;


public class estrutura_decisao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int checar;
		
		System.out.println("Informe o número: ");
		checar = ler.nextInt();
		
		
		if (checar >  0) 
		{
			System.out.println("Número positivo");
				}
		else if(checar == 0) 
		{
			System.out.println("Número zero");
			}
		else System.out.println("Número negativo");
		
		}

}
