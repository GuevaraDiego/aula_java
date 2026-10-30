package diego_aula_01_10;

public class Ferrari implements Veiculo {
	
	@Override
	public void ligar() {
		System.out.println("O carro acabou de ligar...");
	}
	
	@Override
	public void desligar() {
		System.out.println("O carro desligou do nada...");
	}
	
	@Override
	public void manobrar() {
		System.out.println("O carro está estacionando...");
	}
	
	@Override
	public void engatar() {
		System.out.println("Se não engatar a marcha, não anda...");
	}
		
	@Override
	public void acelerar() {
		System.out.println("Solta a embreagem devagar, e acelera...");
	}
	
	@Override
	public void frear() {
		System.out.println("Freia pelo amor de Deus...");
	}

	

}
