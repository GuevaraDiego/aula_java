package diego_aula_05_11;

public class Empresa {
	private String nome;
	private Departamento nomedep; //Agregação
	
	public Empresa (String nome, Departamento nomedep) {
		this.nome = nome;
		this.nomedep = nomedep;
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getNomedep() {
		return nomedep;
	}

	public void setNomedep(Departamento nomedep) {
		this.nomedep = nomedep;
	}

}
