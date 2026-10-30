package diego_aula_29_10;

public class Principal {

	public static void main(String[] args) {
	
		//Criando uma pessoa
		Pessoa pessoa = new Pessoa("João da Silva", "(11)9999-9999");
		System.out.println("Pessoa: ");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());
		
		//Criando uma pessoa física
		PessoaFisica pessoaFisica = new PessoaFisica("João da Silva", "(11)9999-9999", "123.456.789-00", "300.465.989-x");
		System.out.println("\nPessoa física: ");
		System.out.println("Nome: " + pessoaFisica.getNome());
		System.out.println("Telefone: " + pessoaFisica.getTelefone());
		System.out.println("CPF: " + pessoaFisica.getCpf());
		System.out.println("RG: " + pessoaFisica.getRg());
		
		//Criando pessoa jurídica
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "(11)6345-9875", "63.984.344/0001-23");
		System.out.println("\nPessoa jurídica: ");
		System.out.println("Nome: " + pessoaJuridica.getNome());
		System.out.println("Telefone: " + pessoaJuridica.getTelefone());
		System.out.println("CPF: " + pessoaJuridica.getCnpj());
		

	}

}
