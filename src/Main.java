import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Registro miRegistro = new Registro();

        miRegistro.addGame(new Videojuegos("The Legend of Zelda", "Switch", "Aventura"));
        miRegistro.addGame(new Videojuegos("Hollow Knight", "PC", "Metroidvania"));
        miRegistro.addGame(new Videojuegos("God of War", "PS5", "Accion"));
        miRegistro.addGame(new Videojuegos("Minecraft", "PC", "Aventura"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 🎮 BIENVENIDO A TU ASISTENTE DE VIDEOJUEGOS 🎮 ===");
        System.out.print("¿Qué género te apetece jugar hoy? (Ej: Aventura, Acción, Metroidvania): ");

        String generoBuscado = scanner.nextLine();

        System.out.println();

        // 4. Usamos el metodo de búsqueda de nuestra clase Registro
        miRegistro.buscarPorGenero(generoBuscado);

        // Cerramos el scanner por buenas prácticas
        scanner.close();

    }
}
