public class Videojuegos {
    private String titulo;
    private String plataforma;
    private String genero;

    public Videojuegos(String titulo, String plataforma, String genero) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getGenero() {
        return genero;
    }


    @Override
    public String toString() {
        return "Juego: " + titulo + " | Plataforma: " + plataforma + " | Género: " + genero;
    }
}
