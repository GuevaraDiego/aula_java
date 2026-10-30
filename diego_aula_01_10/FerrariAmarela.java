package diego_aula_01_10;

public class FerrariAmarela extends Veiculos {
	public FerrariAmarela (String placa, String modelo, String cor, int ano) {
		super(placa, modelo, cor, ano);
		
	}
	
	@Override
	public void acelerar() {
		System.out.println("A Ferrari está acelerando...");
	}
	
	@Override
	public void frear() {
		System.out.println("A Ferrari está freando...");
	}
	
	@Override
	public void virar() {
		System.out.println("A Ferrari está virando...");
	}
	
	@Override
	public void ligar() {
		System.out.println("A Ferrari está ligando...");
	}

}
