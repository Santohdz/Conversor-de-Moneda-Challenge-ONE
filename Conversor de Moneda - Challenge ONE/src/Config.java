import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

    public static String obtenerApiKey() {
        Properties propiedades = new Properties();

        try {
            FileInputStream archivo = new FileInputStream("config.properties");
            propiedades.load(archivo);
            return propiedades.getProperty("api_key");
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo de configuración.");
            return "";
        }
    }
}
