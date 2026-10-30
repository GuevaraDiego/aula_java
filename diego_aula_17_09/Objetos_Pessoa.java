package diego_aula_17_09;

public class Objetos_Pessoa {

	public static void main(String[] args) {
		// Criando objetos da classe Pessoa
		Classe_Pessoa pessoa1 = new Classe_Pessoa();
		Classe_Pessoa pessoa2 = new Classe_Pessoa();
		Classe_Pessoa pessoa3 = new Classe_Pessoa();
		
		//Objeto1
		pessoa1.setNome ("Tom Cruise");
		pessoa1.setCpf("787654225");
		pessoa1.setRg("339876098");
		pessoa1.setIdade (60);
		pessoa1.setEndereco ("California, USA");
		pessoa1.setProfissao ("Ator");
		
		//Objeto2
		pessoa2.setNome ("Messi");
		pessoa2.setCpf("987430983");
		pessoa2.setRg("892329837");
	    pessoa2.setIdade (35);
		pessoa2.setEndereco ("Miami, USA");
		pessoa2.setProfissao ("Ator");
		
		//Objeto3
		pessoa3.setNome ("Son Goku");
		pessoa3.setCpf("9867234234");
		pessoa3.setRg("876234234");
	    pessoa3.setIdade (43);
		pessoa3.setEndereco ("Planeta Vegeta");
		pessoa3.setProfissao ("Lutador");
		
		//Chamando metodo get() para apresentar os objetos
		System.out.println("----Objeto1----");
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("CPF: " + pessoa1.getCpf());
		System.out.println("RG: " + pessoa1.getRg());
		System.out.println("Idade: " + pessoa1.getIdade());
		System.out.println("Endereço: " + pessoa1.getEndereco());
		System.out.println("Profissão: " + pessoa1.getProfissao());
		
		
		System.out.println("----Objeto2----");
		System.out.println("Nome: " + pessoa2.getNome());
		System.out.println("CPF: " + pessoa2.getCpf());
		System.out.println("RG: " + pessoa2.getRg());
		System.out.println("Idade: " + pessoa2.getIdade());
		System.out.println("Endereço: " + pessoa2.getEndereco());
		System.out.println("Profissão: " + pessoa2.getProfissao());
		
		System.out.println("----Objeto3----");
		System.out.println("Nome: " + pessoa3.getNome());
		System.out.println("CPF: " + pessoa3.getCpf());
		System.out.println("RG: " + pessoa3.getRg());
		System.out.println("Idade: " + pessoa3.getIdade());
		System.out.println("Endereço: " + pessoa3.getEndereco());
		System.out.println("Profissão: " + pessoa3.getProfissao());
		

	}

}
