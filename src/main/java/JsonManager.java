// JsonManager.java
import com.google.gson.Gson;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonManager {

    public static void main(String[] args) {
        leerJson("Data/data.json");
    }

    public static void leerJson(String rutaArchivo) {
        Gson gson = new Gson();

        try {
            // Leer el contenido del archivo
            String contenido = new String(Files.readAllBytes(Paths.get(rutaArchivo)));

            // Convertir el contenido del archivo a un array de objetos Usuario
            Usuario[] usuarios = gson.fromJson(contenido, Usuario[].class);

            // Imprimir los datos de cada usuario
            for (Usuario usuario : usuarios) {
                System.out.println("Nombre: " + usuario.getNombre());
                System.out.println("Edad: " + usuario.getEdad());
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

}
