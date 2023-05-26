// App.java

import com.google.gson.Gson;

public class App
{
    public static void main( String[] args )
    {
        Gson gson = new Gson();

        // Crear un usuario
        Usuario usuario = new Usuario();
        usuario.setNombre("Juan");
        usuario.setEdad(30);

        // Convertir a JSON
        String json = gson.toJson(usuario);
        System.out.println(json);

        // Convertir de nuevo a Usuario
        Usuario usuario2 = gson.fromJson(json, Usuario.class);
        System.out.println(usuario2.getNombre());
    }
}
