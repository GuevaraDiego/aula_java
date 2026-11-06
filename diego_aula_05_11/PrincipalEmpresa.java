package diego_aula_05_11;

public class PrincipalEmpresa {

	public static void main(String[] args) {
		Departamento departamento = new Departamento("Atendimento ao cliente");

        Empresa empresa = new Empresa("WLS", departamento);

        System.out.println(
            "A empresa " + empresa.getNome() +
            " possui um incrível setor de " +
            empresa.getNomedep().getNomedep()
        );
    }
		
	}

