package diego_aula_27_08;
import java.util.Scanner;

public class vetor_exemplo {

	public static void main(String[] args) {
		
		int a[]  = new int[5];
		
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe uma nota " + i+ "...:");
			a[i]= ler.nextInt();
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
		ler.close();
	}

}
