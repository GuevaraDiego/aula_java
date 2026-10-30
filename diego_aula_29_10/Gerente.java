package diego_aula_29_10;

public class Gerente {
	private String beneficios;
	private double premiacao;
	public Gerente(String beneficios, double premiacao) {
		super();
		this.beneficios = beneficios;
		this.premiacao = premiacao;
	}
	public String getBeneficios() {
		return beneficios;
	}
	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}
	public double getPremiacao() {
		return premiacao;
	}
	public void setPremiacao(double premiacao) {
		this.premiacao = premiacao;
	}
	
	

}
