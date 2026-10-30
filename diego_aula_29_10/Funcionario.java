package diego_aula_29_10;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private String cargo;
	private String departemento;
	public Funcionario(String nome, String cpf, double salario, String cargo, String departemento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.cargo = cargo;
		this.departemento = departemento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDepartemento() {
		return departemento;
	}
	public void setDepartemento(String departemento) {
		this.departemento = departemento;
	}
	
	

}
