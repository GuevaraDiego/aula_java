package diego_aula_03_09;

public class exemplo_matriz_decimal {

	public static void main(String[] args) {
double m[][] = new double [8][8];
		
		//entrada de dados
		for (int i=0;i<8;i++) {
			for(int j=0; j<8; j++) {
				m[i][j] = (double)Math.round(Math.random()*10000)/100.0;
				}
			}
		//saida de dados
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				System.out.println("Os valores são: " +m[i][j]);
			}
		}
	}

}
