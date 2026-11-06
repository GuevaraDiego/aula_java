package diego_aula_05_11;

public class PrincipalLivro {

    public static void main(String[] args) {

        Livro livro = new Livro(
            "Dom Casmurro",
            "Machado de Assis"
        );

        System.out.println("O livro " + livro.getTitulo() + " foi escrito por " +  livro.getAutor().getNome() );
    }
}