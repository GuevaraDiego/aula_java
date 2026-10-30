package diego_aula_17_09;


public class Objeto_Carro {

	public static void main(String[] args) {
		// Criando objetos da classe Pessoa
		Classe_Carro carro1 = new Classe_Carro();
	

		// Objeto1
		carro1.setMarca("Mitsubishi");
		carro1.setNome("Lancer EVO");
		carro1.setModelo("Sport");
		carro1.setCor("Amarelo");
		carro1.setAno(2003);
		carro1.setPortas(5);


	//Chamando metodo get() para apresentar os objetos
	
	System.out.println("----Objeto 1----");
	System.out.println("Marca: " + carro1.getMarca());
	System.out.println("Nome: " + carro1.getNome());
	System.out.println("Modelo: " + carro1.getModelo());
	System.out.println("Cor: " + carro1.getCor());
	System.out.println("Ano: " + carro1.getAno());
	System.out.println("Portas: " + carro1.getPortas());
	}
}
