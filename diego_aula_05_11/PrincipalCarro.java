package diego_aula_05_11;

public class PrincipalCarro {

	public static void main(String[] args) {
		Motor motor = new Motor ("Mercedes");
		Carro carro = new Carro ("1113", motor);
		
		System.out.println("Carro é: " + carro.getModelo() + "\nMotor:  " + motor.getTipo());
	}

}
