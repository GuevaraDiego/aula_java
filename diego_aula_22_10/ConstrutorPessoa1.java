package diego_aula_22_10;

public class ConstrutorPessoa1 {
public static void main(String[] args) {
		
		Pessoa1 jogador1 = new Pessoa1();
		Pessoa1 jogador2 = new Pessoa1("Messi",36);
		
		jogador1.setNome("Ronaldo");
		jogador1.setIdade0(50);
		
		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());
		System.out.println(jogador1.getNome());
		System.out.println(jogador1.getIdade());
	}

}
