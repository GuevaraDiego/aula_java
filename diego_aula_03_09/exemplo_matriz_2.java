package diego_aula_03_09;

public class exemplo_matriz_2 {

	public static void main(String[] args) {
		int m[][] = new int [5][5];
		
		//entrada dos  dados
		
		for(int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				m[i][j] = (int)Math.round(Math.random()*100);
			}
		}
		//saida de dadoss
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.println("Os valores são: " +m[i][j]);
			}
	}

}
}
