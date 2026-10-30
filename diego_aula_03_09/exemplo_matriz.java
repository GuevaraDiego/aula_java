package diego_aula_03_09;

public class exemplo_matriz {

	public static void main(String[] args) {
		int m[][] = new int [3][3];
		
		//entrada de dados
		for (int i=0;i<3;i++) {
			for(int j=0; j<3; j++) {
				m[i][j] = (int)Math.round(Math.random()*100);
				}
			}
		//saida de dados
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("Os valores são: " +m[i][j]);
			}
		}
			
	}

}
