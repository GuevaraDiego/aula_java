package diego_aula_05_11;

public class Principal {

	public static void main(String[] args) {
		Universidade universidade = new Universidade ("USP");
		Estudante estudante = new Estudante ("João,", universidade);
		
		System.out.println("Estudante: " + estudante.getNome() + "\nexuniversidade: " + universidade.getNome());

	}

}
