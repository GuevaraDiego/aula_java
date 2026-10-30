package diego_aula_22_10;

public class Pessoa1 {
	private String nome;
	private int idade;
	
	//Construtor padrão
	
	public Pessoa1 () {
		
	}
	//Construtor com 2 argumentos
	
	public Pessoa1(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	//Construtor com 1 argumentos
	
		public Pessoa1(String nome) {
			this.nome = nome;
		}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade0(int idade) {
		this.idade = idade;
	}
	
			

}
