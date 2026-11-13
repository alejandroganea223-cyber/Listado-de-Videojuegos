import java.util.ArrayList;
import java.util.List;

public class Registro {
    // Encapsulado (aseguramos que sea 'Videojuego' en singular)
    private List<Videojuegos> listaJuegos;

    // Constructor
    public Registro() {
        this.listaJuegos = new ArrayList<>();
    }

    // Metodo para añadir
    public void addGame(Videojuegos nuevoJuego) {
        this.listaJuegos.add(nuevoJuego);
    }

    public void mostrarJuegos() {
        if (listaJuegos.isEmpty()) {
            System.out.println("No hay juegos registrados todavía.");
        } else {
            for (Videojuegos juego : listaJuegos) {
                System.out.println(juego);
            }
        }
    }

    public void buscarPorGenero(String generoBuscado) {
        boolean encontrado = false;


        System.out.println("=== BUSCANDO JUEGOS DE GÉNERO: " + generoBuscado + " ===");

        for (Videojuegos juego : listaJuegos) {
            if (juego.getGenero().equalsIgnoreCase(generoBuscado)) {
                System.out.println(juego);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Lo siento mucho, juego no encontrado con dicho género");
        }
    }
}
