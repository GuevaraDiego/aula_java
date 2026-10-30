package diego_aula_29_10;

public class Principal1 {

	public static void main(String[] args) {
		// criando funcionário gerente
		
		Funcionario funcionario = new Funcionario ("Antonio Mattos", "456.542.789-34", 64578.00, "Gerente", "RH", "Vale refeição", "Fucionario do ano" );
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("CPF: " + funcionario.getCpf());
		System.out.println("Salario: " + funcionario.getSalario());
		System.out.println("Cargo: " + funcionario.getCargo());
		System.out.println("Departamento: " + funcionario.getDepartemento());
		System.out.println("Beneficios: " + funcionario.g);
		
		}

}
