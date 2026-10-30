package diego_aula_01_10;

public class Lobo implements Animal {
		
	@Override
	public void dormir() {
		System.out.println("O Lobo está dormindo...");
	}
	
	@Override
	public void caminhar() {
		System.out.println("O Lobo está caminhando...");
	}
	
	@Override
	public void correr() {
		System.out.println("O Lobo está correndo...");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O Lobo está uivando...");
	}
	
}
