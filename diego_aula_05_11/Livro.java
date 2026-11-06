package diego_aula_05_11;

public class Livro {
    private String titulo;
    private Autor autor; // Composição

    public Livro(String titulo, String nomeAutor) {
        this.titulo = titulo;
        this.autor = new Autor(nomeAutor);
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }
}