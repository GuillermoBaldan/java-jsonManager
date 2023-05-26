# java-jsonManager
Simple programs written in Java to understand how the language works, its use with JSON, and how to use the Maven dependency manager


## Project Description

java-JsonManager is a project created to simplify the handling of JSON files in Java. This project facilitates the process of reading and writing JSON files, allowing users to focus on their program logic without having to worry about the details of JSON manipulation.

## Features

- Simplified reading and writing of JSON files using the Gson library.
- Easy to integrate into any Java project.

## Installation

You can clone this project directly to your machine and use it in your Java project. To do this, follow the steps below:

```bash
# Clone the repository
git clone https://github.com/GuillermoBaldan/java-jsonManager.git

# Navigate to the project directory
cd java-jsonManager
```

## Usage

To use `java-JsonManager` in your project, simply import the package and call the necessary functions. Here's an example:

```java
import com.guillermobaldan.jsonmanager.JsonManager;

// Create a new instance of JsonManager
JsonManager manager = new JsonManager();

// Read a JSON file
JSONObject json = manager.readJson("path/to/your/file.json");

// Modify the JSON and write it back
json.put("key", "value");
manager.writeJson("path/to/your/file.json", json);
```

## Contributing

Contributions are always welcome! If you have any improvements or features you would like to add, feel free to fork the project, make your changes, and then submit a pull request.

## License

java-JsonManager is open-source software licensed under the WeBelieve License.

## Contact

If you have any questions or issues, please create an issue in this repository and we will address it as soon as possible. You can also contact me directly at [guillermobaldan@gmail.com](mailto:guillermobaldan@gmail.com).

## Project Status

This project is finished. But we are open to the possibility of improving and adding new features, so your suggestions and pull requests are welcome.

---
