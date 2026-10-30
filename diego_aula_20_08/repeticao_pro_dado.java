package diego_aula_20_08;
import java.util.Random;

public class repeticao_pro_dado {

	public static void main(String[] args) {
		Random random = new Random();
		int faceDado;
		
		do {
			faceDado = random.nextInt(1,7);
			System.out.println("Face do dado: " + faceDado);
			} while (faceDado !=6);
	}

}
