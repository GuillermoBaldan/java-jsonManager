// App.java
public class AppJsonManager
{
    public static void main( String[] args )
    {
        // Crear un usuario
        Usuario usuario = new Usuario();
        usuario.setNombre("Juan");
        usuario.setEdad(30);
        String rutaArchivo = "usuario.json";

        // Escribir el usuario en un archivo JSON
        // Necesitarás una función escribirJson en JsonManager
        // JsonManager.escribirJson(rutaArchivo, usuario);

        // Leer el usuario desde el archivo JSON
        JsonManager.leerJson(rutaArchivo);
    }
}
