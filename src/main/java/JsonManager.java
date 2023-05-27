// JsonManager.java
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.Writer;

public class JsonManager {

    public static void main(String[] args) {
        readJson("Data/data.json");

        // Create a new user to write to the JSON file
        User newUser = new User();
        newUser.setName("New User");
        newUser.setAge(30);

        writeJson("Data/data.json", newUser);
    }

    public static void readJson(String filePath) {
        Gson gson = new Gson();

        try {
            // Read the content of the file
            String content = new String(Files.readAllBytes(Paths.get(filePath)));

            // Convert the content of the file to an array of User objects
            User[] users = gson.fromJson(content, User[].class);

            // Print the data of each user
            for (User user : users) {
                System.out.println("Name: " + user.getName());
                System.out.println("Age: " + user.getAge());
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void writeJson(String filePath, User user) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (Writer writer = new FileWriter(filePath)) {
            gson.toJson(user, writer);
        } catch (IOException e) {
            System.out.println("Error writing the file: " + e.getMessage());
        }
    }

}
