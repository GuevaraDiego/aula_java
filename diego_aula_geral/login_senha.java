package diego_aula_30_04;

import java.util.Scanner;

public class login_senha {

	public static void main(String[] args) {
		String login, senha;
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe seu login: ");
		login = ler.next();

		System.out.println("Informe sua senha: ");
		senha = ler.next();

		if (login.equals("diego") && senha.equals("D1234")) {

			System.out.println("Bem-vindo ao Sistema Senai");
		}

		else {
			System.out.println("Login errado");
		}

	}

}
