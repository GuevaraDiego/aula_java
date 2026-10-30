package diego_aula_01_10;

public class Principal3 {

	public static void main(String[] args) {
	
		FerrariAmarela carro = new FerrariAmarela ("00000", "F1", "Vermelho", 2023);
		carro.ligar();
		carro.acelerar();
		carro.virar();
		carro.frear();
		
		System.out.println("--------------------------");
		
		
		Onibus marcopolo = new Onibus("11111", "XB1", "Prata", 2020);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.virar();
		marcopolo.frear();
		

	}

}
